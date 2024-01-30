package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;

import static org.example.Direction.E;

public class EastDirection extends  DirectionAbstract{
    private final Direction value;

    private EastDirection(Direction value) {
        this.value = value;
    }
    public static EastDirection createInstance() {
        return new EastDirection(E);
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
    public void moveForward(CoOrdinates coOrdinates) {
        coOrdinates.incrementX();
    }

    @Override
    public void moveBackward(CoOrdinates coOrdinates) {
        coOrdinates.decrementX();
    }

    public Direction getValue() {
        return value;
    }
}
