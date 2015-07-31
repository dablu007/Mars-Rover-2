package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewFinalPositionsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldShowTheFinalPositionOfTheMarsRover() {
        MarsRover marsRover = new MarsRover(1,1,"N",5,5);
        ViewFinalPositions viewFinalPositions = new ViewFinalPositions(marsRover);

        viewFinalPositions.show();
        String expectedOutput = "1 1 N\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
