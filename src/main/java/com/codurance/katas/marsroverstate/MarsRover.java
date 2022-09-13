package com.codurance.katas.marsroverstate;

public class MarsRover {

    private Direction direction;

    private String currentDirection = "N";

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private void turnRight() {
        if ("N".equals(currentDirection)) {
            currentDirection = "E";
            return;
        }
        if ("E".equals(currentDirection)) {
            currentDirection = "S";
            return;
        }
        if ("S".equals(currentDirection)) {
            currentDirection = "W";
            return;
        }
        if ("W".equals(currentDirection)) {
            currentDirection = "N";
            return;
        }
    }

    private void turnLeft() {
        if ("N".equals(currentDirection)) {
            currentDirection = "W";
            return;
        }
        if ("W".equals(currentDirection)) {
            currentDirection = "S";
            return;
        }
        if ("S".equals(currentDirection)) {
            currentDirection = "E";
            return;
        }
        if ("E".equals(currentDirection)) {
            currentDirection = "N";
            return;
        }
    }

    public String execute(String commands) {

        for (char command: commands.toCharArray()) {
            if (command == 'R') {
                turnRight();
            }
            if (command == 'L') {
                turnLeft();
            }
        }

        return "0:0:" + currentDirection;
    }
}
