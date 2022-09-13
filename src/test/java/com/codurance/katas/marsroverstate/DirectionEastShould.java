package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DirectionEastShould {

    private final MarsRover marsRover = new MarsRover();
    private final DirectionEast direction = new DirectionEast(marsRover);

    @Test
    void when_turning_right_should_set_direction_south() {

        direction.turnRight();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:S");
    }

    @Test
    void when_turning_left_should_set_direction_north() {

        direction.turnLeft();

        assertThat(marsRover.execute(""))
                .isEqualTo("0:0:N");
    }

    @Test
    void when_moving_should_increaseX() {

        direction.move();

        assertThat(marsRover.getPosition().getX()).isEqualTo(1);
    }
}
