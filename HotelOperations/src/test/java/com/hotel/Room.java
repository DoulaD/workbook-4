package com.hotel;

public class Room {


    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }
}

