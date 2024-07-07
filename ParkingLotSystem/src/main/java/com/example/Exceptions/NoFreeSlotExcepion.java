package com.example.Exceptions;

public class NoFreeSlotExcepion extends ParkingLotException{
    public NoFreeSlotExcepion(String message)
    {
        super(message);
    }
}
