package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;

import static org.example.Direction.W;

public class WestDirection extends DirectionAbstract {

    private final Direction value;

    private WestDirection(Direction value) {
        this.value = value;
    }

    public static WestDirection createInstance() {
        return new WestDirection(W);
    }

    @Override
    public DirectionAbstract getRightDirection() {
        return NorthDirection.createInstance();
    }

    @Override
    public DirectionAbstract getLeftDirection() {
        return SouthDirection.createInstance();
    }

    @Override
    public void moveForward(CoOrdinates coOrdinates) {
        coOrdinates.decrementX();
    }

    @Override
    public void moveBackward() {

    }

    public Direction getValue() {
        return value;
    }
}
