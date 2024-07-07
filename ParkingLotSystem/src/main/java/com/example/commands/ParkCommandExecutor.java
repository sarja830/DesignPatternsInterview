package com.example.commands;

import com.example.Exceptions.InvalidCommandException;
import com.example.Exceptions.NoFreeSlotExcepion;
import com.example.models.Car;
import com.example.service.ParkingLotService;

public class ParkCommandExecutor extends ICommandExecutor{

    private Car car;
    public ParkCommandExecutor(ParkingLotService parkingLotService, Car car) {
        super(parkingLotService);
        this.car = car;
    }

    @Override
    public void execute() {
        try{
              System.out.println(parkingLotService.park(car));
        }
        catch (NoFreeSlotExcepion exception)
        {
            System.out.println("parking lot full");
        }
    }
}
