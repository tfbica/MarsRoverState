package com.codurance.katas.marsroverstate;

public class DirectionWest extends Direction {


    public DirectionWest(MarsRover context) {
        super(context);
    }

    @Override
    public void turnRight() {

        DirectionNorth newDirection = new DirectionNorth(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionSouth newDirection = new DirectionSouth(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public Position move() {
        return new Position(-1, 0);
    }

    @Override
    public String toString() {
        return "W";
    }
}
