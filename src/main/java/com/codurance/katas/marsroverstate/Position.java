package com.codurance.katas.marsroverstate;

public class Position {
    public static final int GRID_HEIGHT = 10;
    public static final int GRID_WIDTH = 10;
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increaseY() {
        this.y++;
        if (y == GRID_HEIGHT) {
            this.y = 0;
        }
    }

    public void decreaseY() {
        this.y--;
        if (y < 0) {
            this.y = GRID_HEIGHT - 1;
        }
    }

    public void increaseX() {
        this.x++;
        if (x == GRID_WIDTH) {
            this.x = 0;
        }
    }

    public void decreaseX() {
        this.x--;
        if (x < 0) {
            this.x = GRID_WIDTH - 1;
        }
    }

    @Override
    public String toString() {
        return x + ":" + y;
    }
}