package com.codurance.katas.marsroverstate;

import java.util.HashSet;

public class MarsRover {

    public static final String OBSTACLE_PREFIX = "O";
    public static final String SEPARATOR = ":";
    private Position position = new Position(0, 0);
    private Direction direction = new DirectionNorth(this);
    private final Grid grid;

    public MarsRover() {
        this(new Grid());
    }
    public MarsRover(Grid grid) {
        this.grid = grid;
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
                Position newPosition = calculateNewPosition();
                if (grid.hasObstacleAt(newPosition)) {
                    return buildResultWithObstacle();
                }
                position = newPosition;
            }
        }

        return buildResult();
    }

    private String buildResultWithObstacle() {
        return OBSTACLE_PREFIX + SEPARATOR + buildResult();
    }

    private String buildResult() {
        return position + SEPARATOR + direction;
    }

    private Position calculateNewPosition() {
        Position newPosition = new Position(position);
        newPosition.add(direction.move());
        return newPosition;
    }
}
