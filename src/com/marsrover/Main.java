package com.marsrover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MarsRover marsRover;
        Dispatcher dispatcher;
        try {
            int plateauPositionX = Integer.parseInt(bufferedReader.readLine());;
            int plateauPositionY = Integer.parseInt(bufferedReader.readLine());;
            System.out.println("Enter the Number of input you want");
            int numberOfInputs = Integer.parseInt(bufferedReader.readLine());
            while (numberOfInputs > 0) {
                int positionX = Integer.parseInt(bufferedReader.readLine());
                int positionY = Integer.parseInt(bufferedReader.readLine());;
                String direction = bufferedReader.readLine();
                String inputsForMoving = bufferedReader.readLine();
                marsRover = new MarsRover(positionX, positionY , direction , plateauPositionX, plateauPositionY);
                dispatcher = new Dispatcher(marsRover, inputsForMoving);
                dispatcher.forwardInputsToRover();
                System.out.println(marsRover.getPositionX() + " " + marsRover.getPositionY() + " " +
                        marsRover.getDirection());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
