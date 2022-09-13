package com.codurance.katas.marsroverstate;

public abstract class Direction {

    protected MarsRover context;

    public Direction(MarsRover context) {
        this.context = context;
    }

    public abstract void turnRight();

    public abstract void turnLeft();

    public abstract Position move();

}
