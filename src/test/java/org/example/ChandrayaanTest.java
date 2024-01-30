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

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 1, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFrom1To2ForFCommandFacingNorth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 2, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosTo1ForFCommandFacingEast() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(1, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosFrom1To2ForFCommandFacingEast() {

            CoOrdinates coOrdinates = new CoOrdinates(1, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(2, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPos0ToNeg1ForFCommandFacingWest() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(-1, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosFromNeg1ToNeg2ForFCommandFacingWest() {

            CoOrdinates coOrdinates = new CoOrdinates(-1, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(-2, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFrom0ToNeg1ForFCommandFacingSouth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, -1, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFromNeg1ToNeg2ForFCommandFacingSouth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, -1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, -2, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom0To1ForFCommandFacingUp() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "U");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 1);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom1To2ForFCommandFacingUp() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 1);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "U");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 2);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom0ToNeg1ForFCommandFacingDown() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "D");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, -1);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFromNeg1ToNeg2ForFCommandFacingDown() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, -1);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "D");
            List<String> commands = List.of("f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, -2);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldYPosFromNeg1To2orFCommandThriceFacingNorth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, -1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("f","f","f");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 2, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

    }

    @Nested
    class MoveBackwardTest {
        @Test
        void shouldMoveYPosToNeg1ForBCommandFacingNorth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, -1, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFrom1To0ForBCommandFacingNorth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosToNeg1ForBCommandFacingEast() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(-1, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosFrom1To0ForBCommandFacingEast() {

            CoOrdinates coOrdinates = new CoOrdinates(1, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPos0To1ForBCommandFacingWest() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(1, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveXPosFromNeg1To0ForBCommandFacingWest() {

            CoOrdinates coOrdinates = new CoOrdinates(-1, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFrom0To1ForBCommandFacingSouth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 1, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveYPosFromNeg1To0ForBCommandFacingSouth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, -1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom0ToNeg1ForFCommandFacingUp() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "U");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, -1);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom1To0ForFCommandFacingUp() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 1);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "U");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFrom0To1ForBCommandFacingDown() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "D");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 1);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldMoveZPosFromNeg1To0ForBCommandFacingDown() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, -1);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "D");
            List<String> commands = List.of("b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, 0, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

        @Test
        void shouldYPosFromNeg1ToNeg4orBCommandThriceFacingNorth() {

            CoOrdinates coOrdinates = new CoOrdinates(0, -1, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("b","b","b");

            chandrayaan.executeCommands(commands);

            CoOrdinates expectedCoOrdinates = new CoOrdinates(0, -4, 0);
            Assertions.assertEquals(expectedCoOrdinates, chandrayaan.getCoOrdinates());
        }

    }

    @Nested
    class ChangeDirectionTest {
        @Test
        void shouldChangeDirectionFromNorthToEastOnRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToWestOnLeftCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("W", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromEastToSouthOnRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromEastToNorthOnLeftCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "E");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromSouthToWestOnRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("W", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromSouthToEastOnLeftCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "S");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromWestToNorthOnRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromWestToSouthOnLeftCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "W");
            List<String> commands = List.of("l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToEastOnFiveRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("r", "r", "r", "r", "r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("E", chandrayaan.getDirection());
        }

        @Test
        void shouldChangeDirectionFromNorthToSouthOnTwoRightCommand() {

            CoOrdinates coOrdinates = new CoOrdinates(0, 0, 0);
            Chandrayaan chandrayaan = new Chandrayaan(coOrdinates, "N");
            List<String> commands = List.of("r", "r");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("S", chandrayaan.getDirection());
        }

        @Test
        void shouldNotChangDirectionFromNorthOnTwoRightAndTowLeftCommand() {

            Chandrayaan chandrayaan = new Chandrayaan(new CoOrdinates(0, 0, 0), "N");
            List<String> commands = List.of("l", "r", "r", "l");

            chandrayaan.executeCommands(commands);

            Assertions.assertEquals("N", chandrayaan.getDirection());
        }
    }
}