package com.codurance.katas.marsroverstate;

public class DirectionSouth extends Direction {


    @Override
    public void turnRight() {

        DirectionWest newDirection = new DirectionWest();
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionEast newDirection = new DirectionEast();
        this.context.setDirection(newDirection);

    }
}
