package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionEastShould {

    @Test
    void when_turning_right_should_set_direction_south() {

        MarsRover marsRover = new MarsRover();
        DirectionEast directionEast = new DirectionEast(marsRover);

        directionEast.turnRight();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionSouth.class);
    }

    @Test
    void when_turning_left_should_set_direction_north() {

        MarsRover marsRover = new MarsRover();
        DirectionEast directionEast = new DirectionEast(marsRover);

        directionEast.turnLeft();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionNorth.class);
    }


}
