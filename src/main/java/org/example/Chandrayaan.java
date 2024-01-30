package org.example;

import java.util.List;

public class Chandrayaan {
    private int xPos;
    private int yPos;
    private final int zPos;
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
        else
            xPos++;
    }

    public int getXPosition() {
        return xPos;
    }

    public int getYPosition() {
        return yPos;
    }
}
