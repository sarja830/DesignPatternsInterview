package com.example.models;

public class Slot {
    private Car parkedCar;
    private Integer slotNumber;
    public Slot(final Integer slotNumber)
    {
        this.slotNumber = slotNumber;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void assignCar(Car car)
    {
        this.parkedCar = car;
    }


    public void unassignCar()
    {
        assignCar(null);
    }

    public boolean isFree()
    {
        return parkedCar==null;
    }

    @Override
    public String toString() {
        return slotNumber+" "+parkedCar.getColor() + parkedCar.getRegistrationNumber();
    }
}
