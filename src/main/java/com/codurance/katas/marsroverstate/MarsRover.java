package com.codurance.katas.marsroverstate;

public class MarsRover {

    private final Position position = new Position(0, 0);
    private Direction direction = new DirectionNorth(this);

    public Position getPosition() {
        return position;
    }

    void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String execute(String commands) {

        for (char command: commands.toCharArray()) {
            if (command == 'R') {
                direction.turnRight();
            }
            if (command == 'L') {
                direction.turnLeft();
            }
            if (command == 'M') {
                position.add(direction.move());
            }
        }

        return position + ":" + direction;
    }

}
