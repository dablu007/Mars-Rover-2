package com.marsrover;


public class Dispatcher {
    private String inputsForMoving;
    private MarsRover marsRover;

    public Dispatcher(MarsRover marsRover, String inputsForMoving) {
        this.inputsForMoving = inputsForMoving;
        this.marsRover = marsRover;
    }

    public void forwardInputsToRover() {
        for (int i = 0; i < inputsForMoving.length(); i++) {
            String input = String.valueOf(inputsForMoving.charAt(i));
            if (input.equals("M"))
                marsRover.moveRover();
            else {
                marsRover.changeDirection(input);
            }
        }
    }
}
