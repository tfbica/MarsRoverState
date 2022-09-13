package com.codurance.katas.marsroverstate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionShould {

    @ParameterizedTest
    @CsvSource({
            "0,0, 1,0, 1,0",
            "0,0, 0,1, 0,1",
            "1,0, -1,0, 0,0",
            "0,1, 0,-1, 0,0",
            "9,0, 1,0, 0,0",
            "0,9, 0,1, 0,0",
            "0,0, -1,0, 9,0",
            "0,0, 0,-1, 0,9",
    })
    void add(int initialX, int initialY, int vectorX, int vectorY, int resultX, int resultY) {

        Position position = new Position(initialX, initialY);
        Position vector = new Position(vectorX, vectorY);

        position.add(vector);

        assertThat(position).isEqualTo(new Position(resultX, resultY));
    }

}
