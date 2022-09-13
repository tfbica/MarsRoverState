package com.codurance.katas.marsroverstate;

public class DirectionNorth extends Direction {


    @Override
    public void turnRight() {

        DirectionEast newDirection = new DirectionEast();
        this.context.setDirection(newDirection);
    }

    @Override
    public void turnLeft() {

        DirectionWest newDirection = new DirectionWest();
        this.context.setDirection(newDirection);
    }
}
