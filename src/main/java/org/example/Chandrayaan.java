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
        String command = commands.get(0);
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
            yPos++;
        else if ("E".equalsIgnoreCase(direction))
            xPos++;
        else if ("W".equalsIgnoreCase(direction))
            xPos--;
        else if ("S".equalsIgnoreCase(direction))
            yPos--;
        else if ("U".equalsIgnoreCase(direction))
            zPos++;
        else if ("D".equalsIgnoreCase(direction))
            zPos--;
    }

    private void moveBackward() {
        if ("N".equalsIgnoreCase(direction))
            yPos--;
        else if ("E".equalsIgnoreCase(direction))
            xPos--;
        else if ("W".equalsIgnoreCase(direction))
            xPos++;
        else if ("S".equalsIgnoreCase(direction))
            yPos++;
        else if ("U".equalsIgnoreCase(direction))
            zPos--;
        else if ("D".equalsIgnoreCase(direction))
            zPos++;
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
