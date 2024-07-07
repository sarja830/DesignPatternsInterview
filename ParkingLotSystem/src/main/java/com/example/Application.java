package com.example;

import com.example.commands.*;
import com.example.models.Car;
import com.example.models.ParkingLot;
import com.example.models.parkingStrategy.NaturalOrderingParkingStrategy;
import com.example.models.parkingStrategy.ParkingStrategy;
import com.example.service.ParkingLotService;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1000);
        ParkingLotService parkingLotService = new ParkingLotService();
        ParkingStrategy parkingStrategy = new NaturalOrderingParkingStrategy();
        parkingLotService.createParkingLot(parkingLot,parkingStrategy);
        ICommandExecutor parkCommand1 = new ParkCommandExecutor(parkingLotService,new Car("q23","red"));
        ICommandExecutor parkCommand2 = new ParkCommandExecutor(parkingLotService,new Car("q24","white"));
        ICommandExecutor ParkCommand3 = new ParkCommandExecutor(parkingLotService,new Car("q25","red"));
        ICommandExecutor command3 = new GetSlotsForColorCommandExecutor(parkingLotService,"red");
        ICommandExecutor command4 = new GetSlotsForColorCommandExecutor(parkingLotService,"white");
        ICommandExecutor command5 = new GetParkedCarsCommandExecutor(parkingLotService);
        parkCommand1.execute();
        parkCommand2.execute();
        ParkCommand3.execute();
        command3.execute();
        command4.execute();
        command5.execute();

    }
}