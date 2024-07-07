package com.example.commands;

import com.example.Exceptions.InvalidCommandException;
import com.example.Exceptions.NoFreeSlotExcepion;
import com.example.models.Car;
import com.example.service.ParkingLotService;

public class UnParkCommandExecutor extends ICommandExecutor{

    private int slotNumber;
    public UnParkCommandExecutor(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void execute() {
        try{
            parkingLotService.unpark(slotNumber);
        }
        catch (NoFreeSlotExcepion exception)
        {
            System.out.println("parking lot full");
        }
    }
}
