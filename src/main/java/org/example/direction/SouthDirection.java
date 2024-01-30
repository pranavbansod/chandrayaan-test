package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;

import static org.example.Direction.S;

public class SouthDirection extends DirectionAbstract{
    private final Direction value;

    private SouthDirection(Direction value) {
        this.value = value;
    }
    public static SouthDirection createInstance() {
        return new SouthDirection(S);
    }

    @Override
    public DirectionAbstract getRightDirection() {
        return WestDirection.createInstance();
    }

    @Override
    public DirectionAbstract getLeftDirection() {
        return EastDirection.createInstance();
    }

    @Override
    public void moveForward(CoOrdinates coOrdinates) {
        coOrdinates.decrementY();
    }

    @Override
    public void moveBackward() {

    }

    public Direction getValue() {
        return value;
    }
}
