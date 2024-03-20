package org.example;

public class Boundary {
    private final int x;
    private final int y;
    private final int z;

    public Boundary(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean hasCrossedY(int value) {
        return y < value;
    }

    public boolean hasCrossedX(int value) {
        return x < value;
    }

    public boolean hasCrossedZ(int value) {
        return z < value;
    }
}
