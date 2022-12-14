package com.codurance.katas.marsroverstate;

public class DirectionSouth extends Direction {


    public DirectionSouth(MarsRover context) {
        super(context);
    }

    @Override
    public void turnRight() {

        DirectionWest newDirection = new DirectionWest(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionEast newDirection = new DirectionEast(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public Position move() {
        return new Position(0, -1);
    }

    @Override
    public String toString() {
        return "S";
    }
}
