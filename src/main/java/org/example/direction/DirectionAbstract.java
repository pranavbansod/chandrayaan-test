package org.example.direction;

public abstract class DirectionAbstract {
    public abstract DirectionAbstract getRightDirection();
    public abstract DirectionAbstract getLeftDirection();
    public abstract void moveForward();
    public abstract void moveBackward();
}
