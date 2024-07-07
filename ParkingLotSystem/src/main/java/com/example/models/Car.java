package com.example.models;

public class Car {
    private String registrationNumber;
    private String color;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor() {
        return color;
    }


    // no one will be able to modify it inside the constructor
    public Car(final String registrationNumber, final String color)
    {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }
}
