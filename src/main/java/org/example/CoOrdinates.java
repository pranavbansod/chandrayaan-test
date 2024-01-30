package org.example;

public class CoOrdinates {
    private int x;
    private int y;
    private int z;

    public CoOrdinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void incrementY() {
        y++;
    }
    public void decrementZ() {
        z--;
    }

    public void incrementZ() {
        z++;
    }

    public void decrementY() {
        y--;
    }

    public void decrementX() {
        x--;
    }

    public void incrementX() {
        x++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
