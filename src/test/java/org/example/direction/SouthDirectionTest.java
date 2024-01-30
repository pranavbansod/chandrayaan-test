package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.S;

class SouthDirectionTest {

    private SouthDirection southDirection;

    @BeforeEach
    void setUp() {
        southDirection = SouthDirection.createInstance();
    }

    @Test
    void shouldGetValueAsS() {
        Direction value = southDirection.getValue();
        Assertions.assertEquals(S, value);
    }

    @Test
    void shouldGetWestDirectionOnRight() {
        DirectionAbstract rightDirection = southDirection.getRightDirection();

        Assertions.assertEquals(WestDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetEastDirectionOnLeft() {
        DirectionAbstract leftDirection = southDirection.getLeftDirection();

        Assertions.assertEquals(EastDirection.class, leftDirection.getClass());
    }

    @Test
    void shouldMoveForwardInNegativeYDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        southDirection.moveForward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(0, -1, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

    @Test
    void shouldMoveBackwardInNegativeYDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        southDirection.moveBackward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 1, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

}