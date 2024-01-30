package org.example.direction;

import org.example.Direction;

public class WestDirection extends  DirectionAbstract{

    private final Direction value = Direction.W;

    private WestDirection() {
    }
    public static WestDirection createInstance() {
        return new WestDirection();
    }
    @Override
    public DirectionAbstract getRightDirection() {
        return null;
    }

    @Override
    public DirectionAbstract getLeftDirection() {
        return null;
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }
}
