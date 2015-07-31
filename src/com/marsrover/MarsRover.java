package com.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int positionX;
    private int positionY;
    private String direction;
    private int plateauPositionX;
    private int plateauPositionY;
    private static final List<String> directions = Arrays.asList("N", "E", "S", "W");

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
        int value;
        if (input.equals("L"))
            value = 3;
        else
            value = 1;
        turnDirection(value);

    }
    public void turnDirection(int value){
        direction = directions.get((directions.indexOf(direction) + value) % directions.size());
    }
}
