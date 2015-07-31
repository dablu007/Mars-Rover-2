package com.marsrover;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DispatcherTest {

    @Test
    public void shouldMoveTheRoverForInputGiven() {
        MarsRover marsRover = mock(MarsRover.class);
        String input = "M";
        Dispatcher dispatcher = new Dispatcher(marsRover, input);

        dispatcher.forwardInputsToRover();
        verify(marsRover).moveRover();
    }

    @Test
    public void shouldChangeTheDirectionOfRoverForInputGiven() {
        MarsRover marsRover = mock(MarsRover.class);
        String input = "L";
        Dispatcher dispatcher = new Dispatcher(marsRover, input);

        dispatcher.forwardInputsToRover();
        verify(marsRover).changeDirection("L");
    }
}
