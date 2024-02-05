package org.example;

public enum AngularDirection {
    U, D, NONE;

    void moveForward(CoOrdinates coOrdinates) {
        if (U.equals(this))
            coOrdinates.incrementZ();
        else if (D.equals(this))
            coOrdinates.decrementZ();
    }

    void moveBackward(CoOrdinates coOrdinates) {
        if (U.equals(this))
            coOrdinates.decrementZ();
        else if (D.equals(this))
            coOrdinates.incrementZ();
    }

    AngularDirection changeAngularDirection(String command) {
        if (isUpCommand(command)) {
            return turnUp();
        } else {
            return turnDown();
        }
    }

    private AngularDirection turnDown() {
        if (NONE.equals(this) || D.equals(this))
            return D;
        return NONE;
    }

    private AngularDirection turnUp() {
        if (NONE.equals(this) || U.equals(this))
            return U;
        return NONE;
    }

    private boolean isUpCommand(String command) {
        return "U".equalsIgnoreCase(command);
    }
}


