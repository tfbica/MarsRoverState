package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionWestShould {

    @Test
    void when_turning_right_should_set_direction_north() {

        MarsRover marsRover = new MarsRover();
        DirectionWest directionWest = new DirectionWest(marsRover);

        directionWest.turnRight();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionNorth.class);
    }

    @Test
    void when_turning_left_should_set_direction_south() {

        MarsRover marsRover = new MarsRover();
        DirectionWest directionWest = new DirectionWest(marsRover);

        directionWest.turnLeft();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionSouth.class);
    }

    @Test
    void when_moving_should_decreaseX() {

        MarsRover marsRover = new MarsRover();
        DirectionWest directionWest = new DirectionWest(marsRover);

        directionWest.move();

        assertThat(marsRover.getPosition().getX()).isEqualTo(9);
    }

}
