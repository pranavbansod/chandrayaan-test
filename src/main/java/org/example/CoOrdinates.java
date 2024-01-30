package org.example;

import java.util.Objects;

public class CoOrdinates {
    private int x;
    private int y;
    private int z;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoOrdinates that = (CoOrdinates) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

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
