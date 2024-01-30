package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.N;

class NorthDirectionTest {

    private NorthDirection northDirection;

    @BeforeEach
    void setUp() {
        northDirection = NorthDirection.createInstance();
    }

    @Test
    void shouldGetValueAsN() {
        Direction value = northDirection.getValue();
        Assertions.assertEquals(N, value);
    }

    @Test
    void shouldGetEastDirectionOnRight() {
        DirectionAbstract rightDirection = northDirection.getRightDirection();

        Assertions.assertEquals(EastDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetWestDirectionOnLeft() {
        DirectionAbstract leftDirection = northDirection.getLeftDirection();

        Assertions.assertEquals(WestDirection.class, leftDirection.getClass());
    }

    @Test
    void shouldMoveForwardInYDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        northDirection.moveForward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 1, 0);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }
}