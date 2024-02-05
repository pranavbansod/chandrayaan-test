package org.example;

import java.util.List;

import static org.example.AngularDirection.D;
import static org.example.AngularDirection.U;
import static org.example.Direction.*;

public class Chandrayaan {
    private Direction direction;
    private final CoOrdinates coOrdinates;
    private final AngularDirection angularDirection;

    public Chandrayaan(CoOrdinates coOrdinates, String direction, AngularDirection angularDirection) {
        this.direction = Direction.valueOf(direction);
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
            moveForwardInAngularDirection();
        } else {
            moveBackwardInAngularDirection();
        }
    }

    private void moveForwardInAngularDirection() {
        if (U.equals(angularDirection))
            coOrdinates.incrementZ();
        else if (D.equals(angularDirection))
            coOrdinates.decrementZ();
    }

    private void moveBackwardInAngularDirection() {
        if (U.equals(angularDirection))
            coOrdinates.decrementZ();
        else if (D.equals(angularDirection))
            coOrdinates.incrementZ();
    }

    private void moveInPlanerDirection(String command) {
        if (isForwardCommand(command)) {
            direction.moveForward(coOrdinates);
        } else {
            moveBackward();
        }
    }

    private void moveBackward() {
        if (N.equals(direction))
            coOrdinates.decrementY();
        else if (E.equals(direction))
            coOrdinates.decrementX();
        else if (W.equals(direction))
            coOrdinates.incrementX();
        else if (S.equals(direction))
            coOrdinates.incrementY();
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
