package com.codurance.katas.marsroverstate;

public abstract class Direction {

    protected MarsRover context;

    public void setContext(MarsRover context) {
        this.context = context;
    }

    public abstract void turnRight();

    public abstract void turnLeft();
}
