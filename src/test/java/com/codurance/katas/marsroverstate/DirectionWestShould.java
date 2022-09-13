package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionWestShould {

    private final MarsRover marsRover = new MarsRover();
    private final DirectionWest direction = new DirectionWest(marsRover);

    @Test
    void when_turning_right_should_set_direction_north() {

        direction.turnRight();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:N");
    }

    @Test
    void when_turning_left_should_set_direction_south() {

        direction.turnLeft();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:S");
    }

    @Test
    void when_moving_should_decreaseX() {

        Position vector = direction.move();

        assertThat(vector).isEqualTo(new Position(-1, 0));
    }

}
