package com.accenture.masteraschvin.FlixBus;

import java.time.LocalTime;

public class Travel {

    String destination;

    LocalTime departureTime;

    LocalTime arrivalTime;

    boolean tripIsInternational;

    public Travel(String departure, LocalTime departureTime, LocalTime arrivalTime, boolean tripIsInternational) {
        this.destination = departure;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.tripIsInternational = tripIsInternational;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isTripIsInternational() {
        return tripIsInternational;
    }

    public void setTripIsInternational(boolean tripIsInternational) {
        this.tripIsInternational = tripIsInternational;
    }
}
