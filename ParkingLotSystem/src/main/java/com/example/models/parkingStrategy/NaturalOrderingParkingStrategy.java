package com.example.models.parkingStrategy;

import com.example.models.Slot;
import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class NaturalOrderingParkingStrategy implements ParkingStrategy{

    TreeSet<Integer> availableSlots;
    public NaturalOrderingParkingStrategy()
    {
        this.availableSlots = new TreeSet<>();
    }

    public void addSlot(Integer slotNumber)
    {
        availableSlots.add(slotNumber);
    }

    public void removeSlot(Integer slotNumber)
    {
        availableSlots.remove(slotNumber);
    }

    public Integer getNextSlot()
    {
        return availableSlots.first();
    }

}
