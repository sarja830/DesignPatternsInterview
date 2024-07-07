package com.example.Exceptions;

import com.example.service.ParkingLotService;

public class InvalidSlotException extends ParkingLotException {

    public InvalidSlotException(String message) {
        super(message);
    }
}
