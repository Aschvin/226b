package com.accenture.masteraschvin.FlixBus;

public class Vehicle {

    int door;

    int trunk;

    int wheel;

    int passengerCapacity;

    String numberPlate;

    public Vehicle() {
    }

    public Vehicle(int door, int trunk, int wheel, int passengerCapacity, String numberPlate) {
        this.door = door;
        this.trunk = trunk;
        this.wheel = wheel;
        this.passengerCapacity = passengerCapacity;
        this.numberPlate = numberPlate;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getTrunk() {
        return trunk;
    }

    public void setTrunk(int trunk) {
        this.trunk = trunk;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
