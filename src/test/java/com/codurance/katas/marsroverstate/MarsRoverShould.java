package com.codurance.katas.marsroverstate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {

    // turn operation

    @ParameterizedTest
    @CsvSource({
            // Rotate Mars Rover
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N",
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
            // Move Mars Rover
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N",
            // Rotate then move Mars Rover
            "RM, 1:0:E",
            "RRM, 0:9:S",
            "RRRM, 9:0:W",
            "RMMMMMMMMMM, 0:0:E",
            "MMMMMMMMMM, 0:0:N"
    })
    void turn_and_move (String command, String expectedResult) {

        String actualResult = new MarsRover().execute(command);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
