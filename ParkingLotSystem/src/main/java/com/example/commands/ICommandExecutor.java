package com.example.commands;

import com.example.service.ParkingLotService;

public abstract class ICommandExecutor {

//    Why are interface variables static and final by default in Java?
    protected ParkingLotService parkingLotService;

    public ICommandExecutor(ParkingLotService parkingLotService)
    {
        this.parkingLotService = parkingLotService;
    }
    public abstract void execute();
}
