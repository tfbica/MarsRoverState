package com.codurance.katas.marsroverstate;

public class DirectionEast extends Direction {


    public DirectionEast(MarsRover context) {
        super(context);
    }

    @Override
    public void turnRight() {

        DirectionSouth newDirection = new DirectionSouth(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public void turnLeft() {

        DirectionNorth newDirection = new DirectionNorth(this.context);
        this.context.setDirection(newDirection);

    }

    @Override
    public void move() {
        this.context.getPosition().increaseX();
    }

    @Override
    public String toString() {
        return "E";
    }
}
