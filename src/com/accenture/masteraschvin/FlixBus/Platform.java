package com.accenture.masteraschvin.FlixBus;

public class Platform {

    int platformNumber;

    boolean occupied;

    public Platform(int platformNumber, boolean occupied) {
        this.platformNumber = platformNumber;
        this.occupied = occupied;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
