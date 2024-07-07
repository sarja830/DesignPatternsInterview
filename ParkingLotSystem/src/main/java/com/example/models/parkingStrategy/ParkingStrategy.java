package com.example.models.parkingStrategy;

public interface ParkingStrategy {
    void addSlot(Integer slotNumber);
    void removeSlot(Integer slotNumber);
    Integer getNextSlot();

}
