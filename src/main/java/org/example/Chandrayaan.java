package org.example;

import java.util.List;

public class Chandrayaan {
    private Direction direction;
    private final CoOrdinates coOrdinates;
    private AngularDirection angularDirection;

    public Chandrayaan(CoOrdinates coOrdinates, Direction direction, AngularDirection angularDirection) {
        this.direction = direction;
        this.coOrdinates = coOrdinates;
        this.angularDirection = angularDirection;
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

    private void changeDirection(String command) {
        if (isAngularDirectionCommand(command))
            angularDirection = changeAngularDirection(command);
        else
            direction = direction.changeDirection(command);
    }

    private AngularDirection changeAngularDirection(String command) {
        if (isUpCommand(command)) {
            return rotateUp();
        } else
            return rotateDown();
    }

    private AngularDirection rotateUp() {
        if (AngularDirection.NONE.equals(angularDirection) || AngularDirection.U.equals(angularDirection))
            return AngularDirection.U;
        return AngularDirection.NONE;
    }
    private AngularDirection rotateDown() {
        if (AngularDirection.NONE.equals(angularDirection) || AngularDirection.D.equals(angularDirection))
            return AngularDirection.D;
        return AngularDirection.NONE;
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

    private  boolean isAngularDirectionCommand(String command) {
        return isUpCommand(command) || isDownCommand(command);
    }

    private boolean isDownCommand(String command) {
        return "D".equalsIgnoreCase(command);
    }

    private boolean isUpCommand(String command) {
        return "U".equalsIgnoreCase(command);
    }

}
