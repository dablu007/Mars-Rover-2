package com.marsrover;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldChangeThePositionOfRoverWhenDirectionIsNorth() {
        MarsRover marsRover = new MarsRover(1,1,"N",5,5);

        marsRover.moveRover("N");

        Assert.assertEquals(2, marsRover.getPositionX());
    }
}
