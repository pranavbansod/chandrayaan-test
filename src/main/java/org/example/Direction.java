package org.example;

public enum Direction {
    E, W, N, S;

    void moveForward(CoOrdinates coOrdinates) {
        if (N.equals(this))
            coOrdinates.incrementY();
        else if (E.equals(this))
            coOrdinates.incrementX();
        else if (W.equals(this))
            coOrdinates.decrementX();
        else if (S.equals(this))
            coOrdinates.decrementY();
    }

    void moveBackward(CoOrdinates coOrdinates) {
        if (N.equals(this))
            coOrdinates.decrementY();
        else if (E.equals(this))
            coOrdinates.decrementX();
        else if (W.equals(this))
            coOrdinates.incrementX();
        else if (S.equals(this))
            coOrdinates.incrementY();
    }

    Direction changeDirection(String command) {
        if (N.equals(this)) {
            return handleFaceNorth(command);
        } else if (E.equals(this)) {
            return handleFaceEast(command);
        } else if (S.equals(this)) {
            return handleFaceSouth(command);
        } else {
            return handleFaceWest(command);
        }
    }

    private Direction handleFaceSouth(String command) {
        if (isRightCommand(command))
            return W;
        else
            return E;
    }

    private Direction handleFaceEast(String command) {
        if (isRightCommand(command))
            return S;
        else
            return N;
    }

    private Direction handleFaceNorth(String command) {
        if (isRightCommand(command))
            return E;
        else
            return W;
    }

    private Direction handleFaceWest(String command) {
        if (isRightCommand(command))
            return N;
        else
            return S;
    }

    private boolean isRightCommand(String command) {
        return "R".equalsIgnoreCase(command);
    }
}


