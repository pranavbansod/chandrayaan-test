package org.example.direction;

import org.example.CoOrdinates;

public abstract class DirectionAbstract {
    public abstract DirectionAbstract getRightDirection();
    public abstract DirectionAbstract getLeftDirection();
    public abstract void moveForward(CoOrdinates coOrdinates);
    public abstract void moveBackward(CoOrdinates coOrdinates);
}
