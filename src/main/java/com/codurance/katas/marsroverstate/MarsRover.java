package com.codurance.katas.marsroverstate;

public class MarsRover {

    private Direction direction = new DirectionNorth(this);

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private void turnRight() {

        direction.turnRight();
    }

    private void turnLeft() {

        direction.turnLeft();
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

        return "0:0:" + direction;
    }
}
