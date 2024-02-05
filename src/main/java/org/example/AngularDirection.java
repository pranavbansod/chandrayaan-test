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
}


