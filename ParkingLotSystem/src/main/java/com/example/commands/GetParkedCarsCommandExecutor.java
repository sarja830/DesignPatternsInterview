package com.example.commands;

import com.example.Exceptions.InvalidCommandException;
import com.example.Exceptions.NoFreeSlotExcepion;
import com.example.models.Slot;
import com.example.service.ParkingLotService;

import java.util.List;

public class GetParkedCarsCommandExecutor extends ICommandExecutor{

    public GetParkedCarsCommandExecutor(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void execute() {
        try{
            List<Slot> list = parkingLotService.getOccupiedSlots();
            for(Slot s: list)
            {
                System.out.println(s.toString());
            }
        }
        catch (NoFreeSlotExcepion exception)
        {
            System.out.println("parking lot full");
        }
    }
}
