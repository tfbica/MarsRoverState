package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionSouthShould {

    @Test
    void when_turning_right_should_set_direction_west() {

        MarsRover marsRover = new MarsRover();
        DirectionSouth directionSouth = new DirectionSouth(marsRover);

        directionSouth.turnRight();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionWest.class);
    }

    @Test
    void when_turning_left_should_set_direction_east() {

        MarsRover marsRover = new MarsRover();
        DirectionSouth directionSouth = new DirectionSouth(marsRover);

        directionSouth.turnLeft();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionEast.class);
    }
}
