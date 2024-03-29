package org.example;

import java.util.List;

public class Chandrayaan {
    private Direction direction;
    private final CoOrdinates coOrdinates;
    private AngularDirection angularDirection;
    private final Boundary boundary;

    public Chandrayaan(CoOrdinates coOrdinates, Direction direction, AngularDirection angularDirection, Boundary boundary) {
        this.direction = direction;
        this.coOrdinates = coOrdinates;
        this.angularDirection = angularDirection;
        this.boundary = boundary;
    }

    public CoOrdinates getCoOrdinates() {
        return coOrdinates;
    }

    public String getDirection() {
        if (AngularDirection.NONE.equals(angularDirection))
            return direction.toString();
        return angularDirection.toString();
    }

    public void executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (isMoveCommand(command)) {
            move(command);
        } else {
            changeDirection(command);
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
            angularDirection.moveForward(coOrdinates, boundary);
        } else {
            angularDirection.moveBackward(coOrdinates);
        }
    }

    private void moveInPlanerDirection(String command) {
        if (isForwardCommand(command) && boundary.hasNotCrossed(coOrdinates, direction)) {
            direction.moveForward(coOrdinates);
        } else if (isBackwardCommand(command)) {
            direction.moveBackward(coOrdinates);
        }
    }

    private void changeDirection(String command) {
        if (isAngularDirectionCommand(command))
            angularDirection = angularDirection.changeAngularDirection(command);
        else {
            direction = direction.changeDirection(command);
            angularDirection = AngularDirection.NONE;
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

    private boolean isAngularDirectionCommand(String command) {
        return "U".equalsIgnoreCase(command) || isDownCommand(command);
    }

    private boolean isDownCommand(String command) {
        return "D".equalsIgnoreCase(command);
    }

}
