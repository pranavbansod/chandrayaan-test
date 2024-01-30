package org.example.direction;

import org.example.Direction;

import static org.example.Direction.N;

public class NorthDirection extends DirectionAbstract {
    private final Direction value;

    private NorthDirection(Direction value) {

        this.value = value;
    }
    public static NorthDirection createInstance() {
        return new NorthDirection(N);
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
