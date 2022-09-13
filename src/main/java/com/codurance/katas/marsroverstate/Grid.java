package com.codurance.katas.marsroverstate;

import java.util.HashSet;

public class Grid {

    private final HashSet<Position> obstacles;

    public Grid(HashSet<Position> obstacles) {
        this.obstacles = obstacles;
    }

    public boolean hasObstacleAt(Position targetPosition) {
        return obstacles.contains(targetPosition);
    }
}
