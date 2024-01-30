package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.E;

class EastDirectionTest {
    private EastDirection eastDirection;

    @BeforeEach
    void setUp() {
        eastDirection = EastDirection.createInstance();
    }

    @Test
    void shouldGetValueAsE() {
        Direction value = eastDirection.getValue();
        Assertions.assertEquals(E, value);
    }

    @Test
    void shouldGetSouthDirectionOnRight() {
        DirectionAbstract rightDirection = eastDirection.getRightDirection();

        Assertions.assertEquals(SouthDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetNorthDirectionOnLeft() {
        DirectionAbstract leftDirection = eastDirection.getLeftDirection();

        Assertions.assertEquals(NorthDirection.class, leftDirection.getClass());
    }

    @Test
    void shouldMoveForwardInXDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        eastDirection.moveForward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(1, 0, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

    @Test
    void shouldMoveBackwardInXDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        eastDirection.moveBackward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(-1, 0, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

}