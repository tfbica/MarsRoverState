package com.codurance.katas.marsroverstate;

public class DirectionEast extends Direction {


    @Override
    public void turnRight() {

        DirectionSouth newDirection = new DirectionSouth();
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionNorth newDirection = new DirectionNorth();
        this.context.setDirection(newDirection);

    }
}
