package com.marsrover;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarsRover marsRover;
        Dispatcher dispatcher;
        int plateauPositionX = scanner.nextInt();
        int plateauPositionY = scanner.nextInt();
        IView enterNo = new ViewEnterNo();
        enterNo.show();
        int numberOfInputs = scanner.nextInt();
        while (numberOfInputs > 0) {
            int positionX = scanner.nextInt();
            int positionY = scanner.nextInt();
            String direction = scanner.next();
            String inputsForMoving = scanner.next();
            marsRover = new MarsRover(positionX, positionY, direction, plateauPositionX, plateauPositionY);
            dispatcher = new Dispatcher(marsRover, inputsForMoving);
            dispatcher.forwardInputsToRover();
            ViewFinalPositions viewFinalPositions = new ViewFinalPositions(marsRover);
            viewFinalPositions.show();
        }
    }
}
