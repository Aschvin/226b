package com.accenture.masteraschvin.FlixBus;

import java.time.LocalTime;

public class Travel {

    BusTerminal start;

    BusTerminal destination;

    LocalTime departureTime;

    LocalTime arrivalTime;

    Bus bus;

    boolean tripIsInternational;

    public Travel(BusTerminal start, BusTerminal destination, LocalTime departureTime, LocalTime arrivalTime, Bus bus, boolean tripIsInternational) {
        this.start = start;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.bus = bus;
        this.tripIsInternational = tripIsInternational;
    }

    public BusTerminal getStart() {
        return start;
    }

    public void setStart(BusTerminal start) {
        this.start = start;
    }

    public BusTerminal getDestination() {
        return destination;
    }

    public void setDestination(BusTerminal destination) {
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

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public boolean isTripIsInternational() {
        return tripIsInternational;
    }

    public void setTripIsInternational(boolean tripIsInternational) {
        this.tripIsInternational = tripIsInternational;
    }
}
