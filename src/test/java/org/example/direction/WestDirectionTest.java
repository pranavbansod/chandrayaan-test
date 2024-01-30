package org.example.direction;

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


}