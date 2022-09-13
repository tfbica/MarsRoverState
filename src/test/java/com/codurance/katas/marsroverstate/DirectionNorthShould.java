package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

class DirectionNorthShould {

    @Test
    void when_turning_right_should_set_direction_east() {

        MarsRover marsRover = new MarsRover();
        DirectionNorth directionNorth = new DirectionNorth(marsRover);

        directionNorth.turnRight();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionEast.class);
    }

    @Test
    void when_turning_left_should_set_direction_west() {

        MarsRover marsRover = new MarsRover();
        DirectionNorth directionNorth = new DirectionNorth(marsRover);

        directionNorth.turnLeft();

        assertThat(marsRover.getDirection().getClass())
                .isEqualTo(DirectionWest.class);
    }

    @Test
    void when_moving_should_increaseY() {

        MarsRover marsRover = new MarsRover();
        DirectionNorth directionNorth = new DirectionNorth(marsRover);

        directionNorth.move();

        assertThat(marsRover.getPosition().getY()).isEqualTo(1);
    }
}