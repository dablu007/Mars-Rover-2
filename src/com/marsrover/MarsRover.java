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

    public void moveRover() {
        if (direction.equals("N"))
            positionY += 1;
        else if (direction.equals("S"))
            positionY -= 1;
        else if (direction.equals("E"))
            positionX += 1;
        else if (direction.equals("W"))
            positionX -= 1;
    }

    public void changeDirection(String input) {
        if ( input.equals("L") && direction.equals("E"))
            direction = "N";
        else if (input.equals("R") && direction.equals("E"))
            direction = "S";
    }
}
