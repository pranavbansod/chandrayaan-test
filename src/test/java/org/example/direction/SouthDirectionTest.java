package org.example.direction;

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

}