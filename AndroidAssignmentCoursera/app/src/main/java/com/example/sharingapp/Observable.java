package com.example.sharingapp;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> observers = null;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    void notifyObservers()
    {
        for(Observer observer: observers)
            observer.update();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

}
