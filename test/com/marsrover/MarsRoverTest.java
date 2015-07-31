package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldChangeThePositionOfRoverWhenDirectionIsNorth() {
        MarsRover marsRover = new MarsRover(1,1,"N",5,5);

        marsRover.moveRover();
        assertEquals(2, marsRover.getPositionY());
    }

    @Test
    public void shouldChangePositionOfRoverWhenDirectionIsSouth() {
        MarsRover marsRover = new MarsRover(1,1,"S",5,5);

        marsRover.moveRover();
        assertEquals(0, marsRover.getPositionY());
    }

    @Test
    public void shouldChangePositionOfRoverWhenDirectionIsEast() {
        MarsRover marsRover = new MarsRover(1,1,"E",5,5);

        marsRover.moveRover();
        assertEquals(2, marsRover.getPositionX());
    }

    @Test
    public void shouldChangePositionOfRoverWhenDirectionIsWest() {
        MarsRover marsRover = new MarsRover(1,1,"W",5,5);

        marsRover.moveRover();
        assertEquals(0, marsRover.getPositionX());
    }

    @Test
    public void shouldChangeDirectionToNorthWhenDirectionWasEastAndInputWasLeft() {
        MarsRover marsRover = new MarsRover(1,1,"E",5,5);

        marsRover.changeDirection("L");
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void shouldChangeDirectionToSouthWhenDirectionWasEastAndInputWasRight() {
        MarsRover marsRover = new MarsRover(1,1,"E",5,5);

        marsRover.changeDirection("R");
        assertEquals("S", marsRover.getDirection());
    }
}
