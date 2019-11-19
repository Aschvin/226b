package com.accenture.masteraschvin.FlixBus;

import java.time.LocalTime;

public class Travel {

    String departure;

    LocalTime departureTime;

    LocalTime arrivalTime;

    boolean tripIsInternational;

    public Travel(String departure, LocalTime departureTime, LocalTime arrivalTime, boolean tripIsInternational) {
        this.departure = departure;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.tripIsInternational = tripIsInternational;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
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
