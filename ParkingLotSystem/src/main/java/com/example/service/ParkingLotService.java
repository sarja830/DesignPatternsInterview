package com.example.service;

import com.example.Exceptions.ParkingLotException;
import com.example.models.Car;
import com.example.models.ParkingLot;
import com.example.models.Slot;
import com.example.models.parkingStrategy.ParkingStrategy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

    public void createParkingLot(final ParkingLot parkingLot, final ParkingStrategy parkingStrategy )
    {
        if(this.parkingLot!=null)
        {
            throw new ParkingLotException("Parking Lot already exists");
        }
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;
        for(int i=0;i<parkingLot.getCapacity();i++)
            parkingStrategy.addSlot(i);
    }

    public Integer park(final Car car)
    {
        if(!validateParkingLotExists()) {
            throw new ParkingLotException("Not valid parknig lot found");
        }
        Integer slotNumber = parkingStrategy.getNextSlot();
        Slot slot = parkingLot.park(car, slotNumber);
        parkingStrategy.removeSlot(slotNumber);

        return slotNumber;


    }

    public void unpark(Integer slotNunber)
    {
        Slot slot = parkingLot.getSlot(slotNunber);
        slot.unassignCar();
        parkingStrategy.addSlot(slotNunber);
    }

    boolean validateParkingLotExists()
    {
        return parkingLot!=null;
    }

    public List<Slot> getOccupiedSlots()
    {
        List<Slot> occupiedSlots = new LinkedList<>();
        HashMap<Integer,Slot> slots = parkingLot.getSlots();
        for(Integer key: slots.keySet())
            if(!slots.get(key).isFree())
                occupiedSlots.add(slots.get(key));

        return occupiedSlots;
    }

    public List<Slot> getSlotsForColor(String color)
    {
        return    getOccupiedSlots()
                .stream()
                .filter(slot-> color.equals(slot.getParkedCar().getColor()))
                .collect(Collectors.toList());
    }


}
