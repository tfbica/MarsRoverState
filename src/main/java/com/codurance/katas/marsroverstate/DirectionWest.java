package com.codurance.katas.marsroverstate;

public class DirectionWest extends Direction {


    @Override
    public void turnRight() {

        DirectionNorth newDirection = new DirectionNorth();
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionSouth newDirection = new DirectionSouth();
        this.context.setDirection(newDirection);

    }
}
