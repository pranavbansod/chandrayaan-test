package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ChandrayaanTest {

    @Test
    void shouldMoveYPosTo1ForFCommand() {

        Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(1, chandrayaan.getYPosition());
    }

    @Test
    void shouldMoveYPosFrom1To2ForFCommand() {

        Chandrayaan chandrayaan = new Chandrayaan(0, 1, 0, "N");
        List<String> commands = List.of("f");

        chandrayaan.executeCommand(commands);

        Assertions.assertEquals(2, chandrayaan.getYPosition());
    }

}