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
    public Position move() {
        return new Position(0, 1);
    }

    @Override
    public String toString() {
        return "N";
    }
}
