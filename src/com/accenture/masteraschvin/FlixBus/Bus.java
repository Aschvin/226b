package com.accenture.masteraschvin.FlixBus;

public class Bus extends Vehicle{

    boolean busTypeIsDoubleDecker;

    boolean comfortIsFirstClass;

    public Bus(int door, int trunk, int wheel, int passengerCapacity, String numberPlate) {
        super(door, trunk, wheel, passengerCapacity, numberPlate);
    }

    public Bus(int door, int trunk, int wheel, int passengerCapacity, String numberPlate, boolean busTypeIsDoubleDecker, boolean comfortIsFirstClass) {
        super(door, trunk, wheel, passengerCapacity, numberPlate);
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
