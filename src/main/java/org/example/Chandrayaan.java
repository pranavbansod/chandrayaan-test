package org.example;

import java.util.List;

import static org.example.Direction.N;
import static org.example.Direction.E;
import static org.example.Direction.W;
import static org.example.Direction.S;
import static org.example.Direction.U;
import static org.example.Direction.D;

public class Chandrayaan {
    private Direction direction;
    private final CoOrdinates coOrdinates;

    public Chandrayaan(CoOrdinates coOrdinates, String direction) {
        this.direction = Direction.valueOf(direction);
        this.coOrdinates = coOrdinates;
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
        if (isForwardCommand(command)) {
            moveForward();
        } else {
            moveBackward();
        }
    }

    private void moveForward() {
        if (N.equals(direction))
            coOrdinates.incrementY();
        else if (E.equals(direction))
            coOrdinates.incrementX();
        else if (W.equals(direction))
            coOrdinates.decrementX();
        else if (S.equals(direction))
            coOrdinates.decrementY();
        else if (U.equals(direction))
            coOrdinates.incrementZ();
        else if (D.equals(direction))
            coOrdinates.decrementZ();
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
        else if (U.equals(direction))
            coOrdinates.decrementZ();
        else if (D.equals(direction))
            coOrdinates.incrementZ();
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
