package org.example;

import java.util.List;

public class Chandrayaan {
    private String direction;
    private final CoOrdinates coOrdinates;

    public Chandrayaan(CoOrdinates coOrdinates, String direction) {
        this.direction = direction;
        this.coOrdinates = coOrdinates;
    }
    public CoOrdinates getCoOrdinates() {
        return coOrdinates;
    }

    public String getDirection() {
        return direction;
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

    private void changeDirection(String command) {
        if ("N".equalsIgnoreCase(direction)) {
            if ("R".equalsIgnoreCase(command))
                direction = "E";
            else
                direction = "W";
        } else if ("E".equalsIgnoreCase(direction)) {
            if ("R".equalsIgnoreCase(command))
                direction = "S";
            else
                direction = "N";
        } else if ("S".equalsIgnoreCase(direction)) {
            if ("R".equalsIgnoreCase(command))
                direction = "W";
            else
                direction = "E";
        } else if ("W".equalsIgnoreCase(direction)) {
            if ("R".equalsIgnoreCase(command))
                direction = "N";
            else
                direction = "S";
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
        if ("N".equalsIgnoreCase(direction))
            coOrdinates.incrementY();
        else if ("E".equalsIgnoreCase(direction))
            coOrdinates.incrementX();
        else if ("W".equalsIgnoreCase(direction))
            coOrdinates.decrementX();
        else if ("S".equalsIgnoreCase(direction))
            coOrdinates.decrementY();
        else if ("U".equalsIgnoreCase(direction))
            coOrdinates.incrementZ();
        else if ("D".equalsIgnoreCase(direction))
            coOrdinates.decrementZ();
    }

    private void moveBackward() {
        if ("N".equalsIgnoreCase(direction))
            coOrdinates.decrementY();
        else if ("E".equalsIgnoreCase(direction))
            coOrdinates.decrementX();
        else if ("W".equalsIgnoreCase(direction))
            coOrdinates.incrementX();
        else if ("S".equalsIgnoreCase(direction))
            coOrdinates.incrementY();
        else if ("U".equalsIgnoreCase(direction))
            coOrdinates.decrementZ();
        else if ("D".equalsIgnoreCase(direction))
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
