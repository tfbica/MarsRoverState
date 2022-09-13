package com.codurance.katas.marsroverstate;

public class MarsRover {

    private final Position position = new Position(0, 0);
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

            if (command == 'M') {
                move();

            }
        }

        return position + ":" + direction;
    }

    private void move() {
        if (direction.toString().equals("N")) {
            position.increaseY();
        }

        if (direction.toString().equals("S")) {
            position.decreaseY();
        }

        if (direction.toString().equals("E")) {
            position.increaseX();
        }

        if (direction.toString().equals("W")) {
            position.decreaseX();
        }

    }
}
