package org.example.direction;

import org.example.Direction;

public class NorthDirection extends DirectionAbstract {

    private final Direction value = Direction.N;

    private NorthDirection() {

    }
    public static NorthDirection createInstance() {
        return new NorthDirection();
    }

    @Override
    public DirectionAbstract getRightDirection() {
        return EastDirection.createInstance();
    }

    @Override
    public DirectionAbstract getLeftDirection() {
        return WestDirection.createInstance();
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }

    public Direction getValue() {
        return value;
    }
}
