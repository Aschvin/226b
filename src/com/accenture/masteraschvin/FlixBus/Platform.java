package com.accenture.masteraschvin.FlixBus;

public class Platform {

    String platformNumber;

    String platformSize;

    boolean busServiceIsInternational;

    String busType;

    boolean occupied;

    public Platform(String platformNumber, String platformSize, boolean busServiceIsInternational, String busType, boolean occupied) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.busServiceIsInternational = busServiceIsInternational;
        this.busType = busType;
        this.occupied = occupied;
    }

    public boolean isAvailable(Travel travel){

        return false;
    }

    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    public String getPlatformSize() {
        return platformSize;
    }

    public void setPlatformSize(String platformSize) {
        this.platformSize = platformSize;
    }

    public boolean isBusServiceIsInternational() {
        return busServiceIsInternational;
    }

    public void setBusServiceIsInternational(boolean busServiceIsInternational) {
        this.busServiceIsInternational = busServiceIsInternational;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
