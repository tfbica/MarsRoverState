package com.codurance.katas.marsroverstate;

public class DirectionNorth extends Direction {


    public DirectionNorth(MarsRover context) {
        super(context);
    }

    @Override
    public void turnRight() {

        DirectionEast newDirection = new DirectionEast(this.context);
        this.context.setDirection(newDirection);
    }

    @Override
    public void turnLeft() {

        DirectionWest newDirection = new DirectionWest(this.context);
        this.context.setDirection(newDirection);
    }

    @Override
    public void move() {

        this.context.getPosition().increaseY();

    }

    @Override
    public String toString() {
        return "N";
    }
}
