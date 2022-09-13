package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

class GridShould {

    @Test
    void check_for_no_obstacles() {

        Position targetPosition = new Position(0, 0);
        HashSet<Position> obstacles = new HashSet<>();

        Grid grid = new Grid(obstacles);
        assertThat(grid.hasObstacleAt(targetPosition)).isFalse();
    }

    @Test
    void check_for_obstacles() {

        Position targetPosition = new Position(0, 0);
        HashSet<Position> obstacles = new HashSet<>();
        obstacles.add(targetPosition);

        Grid grid = new Grid(obstacles);
        assertThat(grid.hasObstacleAt(targetPosition)).isTrue();
    }

}