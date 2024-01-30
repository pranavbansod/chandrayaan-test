package org.example.direction;

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

}