package com.example.commands;

import com.example.Exceptions.NoFreeSlotExcepion;
import com.example.models.Slot;
import com.example.service.ParkingLotService;

import java.util.List;

public class GetSlotsForColorCommandExecutor extends ICommandExecutor{

    private String color;
    public GetSlotsForColorCommandExecutor(ParkingLotService parkingLotService, String color) {
        super(parkingLotService);
        this.color = color;
    }

    @Override
    public void execute() {
        try{

            List<Slot> list = parkingLotService.getSlotsForColor(color);
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
