package org.example;

import java.util.List;

public class Chandrayaan {
    private int xPos;
    private int yPos;
    private int zPos;
    private String direction;
    private final CoOrdinates coOrdinates;

    public Chandrayaan(int xPos, int yPos, int zPos, String direction, CoOrdinates coOrdinates) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
        this.direction = direction;
        this.coOrdinates = coOrdinates;
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

    public int getXPosition() {
        return coOrdinates.getX();
    }

    public int getYPosition() {
        return coOrdinates.getY();
    }

    public int getZPosition() {
        return coOrdinates.getZ();
    }

    public String getDirection() {
        return direction;
    }
}
