package org.example.direction;

import org.example.CoOrdinates;
import org.example.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.Direction.D;
import static org.example.Direction.U;

class UpDirectionTest {
    private UpDirection upDirection;

    @BeforeEach
    void setUp() {
        upDirection = UpDirection.createInstance();
    }

    @Test
    void shouldGetValueAsU() {
        Direction value = upDirection.getValue();
        Assertions.assertEquals(U, value);
    }

    @Test
    void shouldGetSouthDirectionOnRight() {
        DirectionAbstract rightDirection = upDirection.getRightDirection();

        Assertions.assertEquals(EastDirection.class, rightDirection.getClass());
    }

    @Test
    void shouldGetNorthDirectionOnLeft() {
        DirectionAbstract leftDirection = upDirection.getLeftDirection();

        Assertions.assertEquals(WestDirection.class, leftDirection.getClass());
    }

}