package com.marsrover;


public class ViewFinalPositions {
    private MarsRover marsRover;

    public ViewFinalPositions(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void show() {
        System.out.println(marsRover.getPositionX() + " " + marsRover.getPositionY() + " "+
                            marsRover.getDirection());
    }
}
