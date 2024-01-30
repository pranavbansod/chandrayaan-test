package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.W;

class WestDirectionTest {

    private WestDirection westDirection;

    @BeforeEach
    void setUp() {
        westDirection = WestDirection.createInstance();
    }

    @Test
    void shouldGetValueAsW() {
        Direction value = westDirection.getValue();
        Assertions.assertEquals(W, value);
    }

    @Test
    void shouldGetNorthDirectionOnRight() {
        DirectionAbstract rightDirection = westDirection.getRightDirection();

        Assertions.assertEquals(NorthDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetSouthDirectionOnLeft() {
        DirectionAbstract leftDirection = westDirection.getLeftDirection();

        Assertions.assertEquals(SouthDirection.class, leftDirection.getClass());
    }

    @Test
    void shouldMoveForwardInNegativeXDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        westDirection.moveForward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(-1, 0, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

    @Test
    void shouldMoveBackwardInNegativeXDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        westDirection.moveBackward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(1, 0, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

}