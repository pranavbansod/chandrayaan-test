package org.example;

import java.util.List;

public class Chandrayaan {
    private Direction direction;
    private final CoOrdinates coOrdinates;
    private final AngularDirection angularDirection;

    public Chandrayaan(CoOrdinates coOrdinates, Direction direction, AngularDirection angularDirection) {
        this.direction = direction;
        this.coOrdinates = coOrdinates;
        this.angularDirection = angularDirection;
    }

    public CoOrdinates getCoOrdinates() {
        return coOrdinates;
    }

    public String getDirection() {
        return direction.toString();
    }

    public void executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (isMoveCommand(command)) {
            move(command);
        } else {
            direction = direction.changeDirection(command);
        }
    }

    private void move(String command) {
        if (AngularDirection.NONE.equals(angularDirection))
            moveInPlanerDirection(command);
        else
            moveInAngularDirection(command);
    }

    private void moveInAngularDirection(String command) {
        if (isForwardCommand(command)) {
            angularDirection.moveForward(coOrdinates);
        } else {
            angularDirection.moveBackward(coOrdinates);
        }
    }

    private void moveInPlanerDirection(String command) {
        if (isForwardCommand(command)) {
            direction.moveForward(coOrdinates);
        } else {
            direction.moveBackward(coOrdinates);
        }
    }

    private boolean isMoveCommand(String command) {
        return isForwardCommand(command) || isBackwardCommand(command);
    }

    private boolean isBackwardCommand(String command) {
        return "B".equalsIgnoreCase(command);
    }

    private boolean isForwardCommand(String command) {
        return "F".equalsIgnoreCase(command);
    }

}
