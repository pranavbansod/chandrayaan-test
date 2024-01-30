package org.example.direction;

import org.example.Direction;

public class EastDirection extends  DirectionAbstract{

    private final Direction value = Direction.E;

    private EastDirection() {
    }
    public static EastDirection createInstance() {
        return new EastDirection();
    }
    @Override
    public DirectionAbstract getRightDirection() {
        return SouthDirection.createInstance();
    }

    @Override
    public DirectionAbstract getLeftDirection() {
        return NorthDirection.createInstance();
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
