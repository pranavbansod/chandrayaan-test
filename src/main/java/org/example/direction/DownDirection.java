package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;

import static org.example.Direction.D;

public class DownDirection extends DirectionAbstract {

    private final Direction value;

    private DownDirection(Direction value) {
        this.value = value;
    }

    public static DownDirection createInstance() {
        return new DownDirection(D);
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
        coOrdinates.decrementZ();
    }

    @Override
    public void moveBackward() {

    }

    public Direction getValue() {
        return value;
    }
}
