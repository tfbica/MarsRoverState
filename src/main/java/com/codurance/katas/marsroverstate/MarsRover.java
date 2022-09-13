package com.codurance.katas.marsroverstate;

public class MarsRover {

    private Direction direction = new DirectionNorth(this);

    private int x = 0;
    private int y = 0;

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

        return x + ":" + y + ":" + direction;
    }

    private void move() {
        if (direction.toString().equals("N")) {
            if(y == 9) {
                this.y = 0;
            } else {
                this.y++;
            }
        }

        if (direction.toString().equals("S")) {

            if(y == 0) {
                this.y = 9;
            } else {
                this.y--;
            }
        }

        if (direction.toString().equals("E")) {
            if(x == 9) {
                this.x = 0;
            } else {
                this.x++;
            }
        }

        if (direction.toString().equals("W")) {

            if(x == 0) {
                this.x = 9;
            } else {
                this.x--;
            }
        }

    }
}
