package com.codurance.katas.marsroverstate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {

    // turn operation

    @ParameterizedTest
    @CsvSource({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N",
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
    })
    void turn(String command, String expectedResult) {

        String actualResult = new MarsRover().execute(command);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    // move operation

}
