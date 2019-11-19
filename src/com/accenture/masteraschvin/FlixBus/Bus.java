package com.accenture.masteraschvin.FlixBus;

public class Bus extends Vehicle{

    boolean busTypeIsDoubleDecker;

    boolean comfortIsFirstClass;

    public Bus(int door, int trunk, int wheel, int passengerCapacity, boolean busTypeIsDoubleDecker, boolean comfortIsFirstClass) {
        super(door, trunk, wheel, passengerCapacity);
        this.busTypeIsDoubleDecker = busTypeIsDoubleDecker;
        this.comfortIsFirstClass = comfortIsFirstClass;
    }

    public boolean isBusTypeIsDoubleDecker() {
        return busTypeIsDoubleDecker;
    }

    public void setBusTypeIsDoubleDecker(boolean busTypeIsDoubleDecker) {
        this.busTypeIsDoubleDecker = busTypeIsDoubleDecker;
    }

    public boolean isComfortIsFirstClass() {
        return comfortIsFirstClass;
    }

    public void setComfortIsFirstClass(boolean comfortIsFirstClass) {
        this.comfortIsFirstClass = comfortIsFirstClass;
    }
}
