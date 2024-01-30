package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ChandrayaanTest {

    @Test
    void shouldMoveYPosTo1ForFCommandFacingNorth() {

        Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(1, chandrayaan.getYPosition());
    }

    @Test
    void shouldMoveYPosFrom1To2ForFCommandFacingNorth() {

        Chandrayaan chandrayaan = new Chandrayaan(0, 1, 0, "N");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(2, chandrayaan.getYPosition());
    }

    @Test
    void shouldMoveYPosTo1ForFCommandFacingEast() {

        Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "E");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(1, chandrayaan.getXPosition());
    }

    @Test
    void shouldMoveXPosFrom1To2ForFCommandFacingEast() {

        Chandrayaan chandrayaan = new Chandrayaan(1, 0, 0, "E");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(2, chandrayaan.getXPosition());
    }
}