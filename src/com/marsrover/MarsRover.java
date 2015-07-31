package com.marsrover;

public class MarsRover {
    private int positionX;
    private int positionY;
    private String direction;
    private int plateauPositionX;
    private int plateauPositionY;

    public MarsRover(int positionX, int positionY, String direction, int plateauPositionX, int plateauPositionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.plateauPositionX = plateauPositionX;
        this.plateauPositionY = plateauPositionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getDirection() {
        return direction;
    }

    public void moveRover(String inputDirection) {
        positionX += 1;
    }
}
