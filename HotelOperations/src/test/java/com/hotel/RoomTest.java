package com.hotel;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
//        arrange
        Room room1 = new Room(2,150.00,true,true);
//        Act
        room1.checkIn();
//        Assert
        assertTrue(room1.isOccupied(),"Should not be able to book occupied room.");
        assertTrue(room1.isDirty(),"Should not be able to book dirty room");
    }

}