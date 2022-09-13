package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionSouthShould {


    private final MarsRover marsRover = new MarsRover();
    private final DirectionSouth direction = new DirectionSouth(marsRover);

    @Test
    void when_turning_right_should_set_direction_west() {

        direction.turnRight();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:W");
    }

    @Test
    void when_turning_left_should_set_direction_east() {

        direction.turnLeft();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:E");
    }
    @Test
    void when_moving_should_decreaseY() {

        MarsRover marsRover = new MarsRover();
        DirectionSouth directionSouth = new DirectionSouth(marsRover);

        directionSouth.move();

        assertThat(marsRover.getPosition().getY()).isEqualTo(9);
    }
}
