package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.D;

class DownDirectionTest {
    private DownDirection downDirection;

    @BeforeEach
    void setUp() {
        downDirection = DownDirection.createInstance();
    }

    @Test
    void shouldGetValueAsD() {
        Direction value = downDirection.getValue();
        Assertions.assertEquals(D, value);
    }

    @Test
    void shouldGetSouthDirectionOnRight() {
        DirectionAbstract rightDirection = downDirection.getRightDirection();

        Assertions.assertEquals(EastDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetNorthDirectionOnLeft() {
        DirectionAbstract leftDirection = downDirection.getLeftDirection();

        Assertions.assertEquals(WestDirection.class, leftDirection.getClass());
    }

    @Test
    void shouldMoveForwardInNegativeZDirection() {
        CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);

        downDirection.moveForward(coOrdinates);

        CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, -1);
        Assertions.assertEquals(expectedCoOrdinates, coOrdinates);

    }

}