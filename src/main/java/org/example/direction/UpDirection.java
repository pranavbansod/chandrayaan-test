package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;

import static org.example.Direction.U;

public class UpDirection extends DirectionAbstract {

    private final Direction value;

    private UpDirection(Direction value) {
        this.value = value;
    }

    public static UpDirection createInstance() {
        return new UpDirection(U);
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
    public void moveForward(CoOrdinates coOrdinates) {
        coOrdinates.incrementZ();
    }

    @Override
    public void moveBackward() {

    }

    public Direction getValue() {
        return value;
    }
}
