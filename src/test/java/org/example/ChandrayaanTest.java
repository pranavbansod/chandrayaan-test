package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

class ChandrayaanTest {

    @Nested
    class MoveForwardTest {
        @Test
        void shouldMoveYPosTo1ForFCommandFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveYPosFrom1To2ForFCommandFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 1, 0, "N");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(2, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveXPosTo1ForFCommandFacingEast() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "E");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPosFrom1To2ForFCommandFacingEast() {

            Chandrayaan chandrayaan = new Chandrayaan(1, 0, 0, "E");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(2, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPos0ToNeg1ForFCommandFacingWest() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "W");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPosFromNeg1ToNeg2ForFCommandFacingWest() {

            Chandrayaan chandrayaan = new Chandrayaan(-1, 0, 0, "W");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-2, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveYPosFrom0ToNeg1ForFCommandFacingSouth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "S");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveYPosFromNeg1ToNeg2ForFCommandFacingSouth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, -1, 0, "S");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-2, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveZPosFrom0To1ForFCommandFacingUp() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "U");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFrom1To2ForFCommandFacingUp() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 1, "U");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(2, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFrom0ToNeg1ForFCommandFacingDown() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "D");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFromNeg1ToNeg2ForFCommandFacingDown() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, -1, "D");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-2, chandrayaan.getZPosition());
        }

        @Test
        void shouldYPosFromNeg1To2orFCommandThriceFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, -1, 0, "N");
            List<String> commands = List.of("f","f","f");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(2, chandrayaan.getYPosition());
        }

    }

    @Nested
    class MoveBackwardTest {
        @Test
        void shouldMoveYPosToNeg1ForBCommandFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveYPosFrom1To0ForBCommandFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 1, 0, "N");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveXPosToNeg1ForBCommandFacingEast() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "E");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPosFrom1To0ForBCommandFacingEast() {

            Chandrayaan chandrayaan = new Chandrayaan(1, 0, 0, "E");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPos0To1ForBCommandFacingWest() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "W");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveXPosFromNeg1To0ForBCommandFacingWest() {

            Chandrayaan chandrayaan = new Chandrayaan(-1, 0, 0, "W");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getXPosition());
        }

        @Test
        void shouldMoveYPosFrom0To1ForBCommandFacingSouth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "S");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveYPosFromNeg1To0ForBCommandFacingSouth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, -1, 0, "S");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getYPosition());
        }

        @Test
        void shouldMoveZPosFrom0ToNeg1ForFCommandFacingUp() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "U");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-1, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFrom1To0ForFCommandFacingUp() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 1, "U");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFrom0To1ForBCommandFacingDown() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "D");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(1, chandrayaan.getZPosition());
        }

        @Test
        void shouldMoveZPosFromNeg1To0ForBCommandFacingDown() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, -1, "D");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(0, chandrayaan.getZPosition());
        }

        @Test
        void shouldYPosFromNeg1ToNeg4orBCommandThriceFacingNorth() {

            Chandrayaan chandrayaan = new Chandrayaan(0, -1, 0, "N");
            List<String> commands = List.of("b","b","b");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals(-4, chandrayaan.getYPosition());
        }

    }

    @Nested
    class ChangeDirectionTest {
        @Test
        void shouldChangeDirectionFromNorthToEastOnRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToWestOnLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("W", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromEastToSouthOnRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "E");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromEastToNorthOnLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "E");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromSouthToWestOnRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "S");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("W", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromSouthToEastOnLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "S");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromWestToNorthOnRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "W");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromWestToSouthOnLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "W");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToEastOnFiveRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("r", "r", "r", "r", "r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToSouthOnTwoRightCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("r", "r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldNotChangDirectionFromNorthOnTwoRightAndTowLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, "N");
            List<String> commands = List.of("l", "r", "r", "l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }
    }
}