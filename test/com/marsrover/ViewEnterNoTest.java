package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewEnterNoTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldShowTheFinalPositionOfTheMarsRover() {
        IView view = new ViewEnterNo();

        view.show();
        assertEquals("Enter the Number of input you want\n", outContent.toString());
    }
}
