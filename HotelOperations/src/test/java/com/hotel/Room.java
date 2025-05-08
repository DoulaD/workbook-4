package com.hotel;

public class Room {


    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
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
//        derived
    }

    public void checkIn(){
        if(isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest Checked In.");
        } else {
            System.out.println("Room not available.");
        }
    }

    public void checkOut(){
if (occupied) {
    occupied = false;
    dirty = true;
    System.out.println("Guest checked out. Room is now dirty.");
} else {
    System.out.println("No guest in the room");
}
    }
    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room has been cleaned");
        } else {
            System.out.println("Room already clean");
        }

    }
}

