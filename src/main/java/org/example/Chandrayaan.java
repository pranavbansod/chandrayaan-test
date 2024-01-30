package org.example;

import java.util.List;

public class Chandrayaan {
    private int xPos;
    private int yPos;
    private int zPos;
    private final String direction;

    public Chandrayaan(int xPos, int yPos, int zPos, String direction) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
        this.direction = direction;
    }

    public void executeCommand(List<String> commands) {
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
}
