package org.example;

import java.util.List;

public class Chandrayaan {
    private int xPos;
    private int yPos;
    private int zPos;
    private String direction;

    public Chandrayaan(int xPos, int yPos, int zPos, String direction) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
        this.direction = direction;
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
            incrementY();
        else if ("E".equalsIgnoreCase(direction))
            incrementX();
        else if ("W".equalsIgnoreCase(direction))
            decrementX();
        else if ("S".equalsIgnoreCase(direction))
            decrementY();
        else if ("U".equalsIgnoreCase(direction))
            incrementZ();
        else if ("D".equalsIgnoreCase(direction))
            decrementZ();
    }

    private void moveBackward() {
        if ("N".equalsIgnoreCase(direction))
            decrementY();
        else if ("E".equalsIgnoreCase(direction))
            decrementX();
        else if ("W".equalsIgnoreCase(direction))
            incrementX();
        else if ("S".equalsIgnoreCase(direction))
            incrementY();
        else if ("U".equalsIgnoreCase(direction))
            decrementZ();
        else if ("D".equalsIgnoreCase(direction))
            incrementZ();
    }

    private void incrementX() {
        xPos++;
    }

    private void decrementX() {
        xPos--;
    }

    private void incrementY() {
        yPos++;
    }

    private void decrementY() {
        yPos--;
    }

    private void incrementZ() {
        zPos++;
    }

    private void decrementZ() {
        zPos--;
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
        return xPos;
    }

    public int getYPosition() {
        return yPos;
    }

    public int getZPosition() {
        return zPos;
    }

    public String getDirection() {
        return direction;
    }
}
