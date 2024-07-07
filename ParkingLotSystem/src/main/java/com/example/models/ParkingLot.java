package com.example.models;

import com.example.Exceptions.InvalidSlotException;
import com.example.Exceptions.ParkingLotException;

import java.util.HashMap;

public class ParkingLot {
    public static int MAX_CAPACITY = 1000;
    private int capacity;
    private HashMap<Integer, Slot> slots;

    public int getCapacity() {
        return capacity;
    }

    public ParkingLot(final int capacity)
    {
        // throw new Exception
        if(capacity>MAX_CAPACITY || capacity<=0)
            throw new ParkingLotException("Invalid parking lot capacity");
        this.capacity = capacity;
        this.slots = new HashMap<>();

    }

    public Slot getSlot(final Integer slotNumber)
    {
        if(slotNumber>=MAX_CAPACITY)
            throw new InvalidSlotException("Invalid slot exception");

        if(!slots.containsKey(slotNumber))
            slots.put(slotNumber, new Slot(slotNumber));
        return slots.get(slotNumber);
    }

    public Slot park(final Car car, final Integer slotNumber){
        final Slot slot = getSlot(slotNumber);
        if(slot.isFree())
            slot.assignCar(car);
        return slot;
    }
    public HashMap<Integer, Slot> getSlots() {
        return slots;
    }

    Slot unPark(final int slotNumber)
    {
        Slot slot = getSlot(slotNumber);
        slot.unassignCar();
        return slot;
    }
}
