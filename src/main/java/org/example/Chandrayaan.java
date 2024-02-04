package org.example;

import org.example.direction.DirectionAbstract;

import java.util.List;

public class Chandrayaan {
    public static final String R = "R";
    public static final String B = "B";
    public static final String F = "F";
    private final CoOrdinates coOrdinates;
    private DirectionAbstract direction;

    public Chandrayaan(CoOrdinates coOrdinates, DirectionAbstract direction) {
        this.direction = direction;
        this.coOrdinates = coOrdinates;
    }

    public CoOrdinates getCoOrdinates() {
        return coOrdinates;
    }

    public DirectionAbstract getDirection() {
        return direction;
    }

    public void executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (isMoveCommand(command)) {
            move(command);
        } else {
            direction = changeDirection(command);
        }
    }

    private DirectionAbstract changeDirection(String command) {
        if (isRightCommand(command))
            return direction.getRightDirection();
        return direction.getLeftDirection();
    }

    private boolean isRightCommand(String command) {
        return R.equalsIgnoreCase(command);
    }

    private void move(String command) {
        if (isForwardCommand(command)) {
            direction.moveForward(coOrdinates);
        } else {
            direction.moveBackward(coOrdinates);
        }
    }

    private boolean isMoveCommand(String command) {
        return isForwardCommand(command) || isBackwardCommand(command);
    }

    private boolean isBackwardCommand(String command) {
        return B.equalsIgnoreCase(command);
    }

    private boolean isForwardCommand(String command) {
        return F.equalsIgnoreCase(command);
    }

}
