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
