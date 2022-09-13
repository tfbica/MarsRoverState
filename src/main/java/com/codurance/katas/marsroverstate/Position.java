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

    public void add(Position vector) {

        this.x += vector.x;
        if (x >= GRID_WIDTH) {
            this.x = 0;
        } else if (x < 0) {
            this.x = GRID_WIDTH - 1;
        }

        this.y += vector.y;
        if (y >= GRID_HEIGHT) {
            this.y = 0;
        } else if (y < 0) {
            this.y = GRID_HEIGHT - 1;
        }
    }

    @Override
    public String toString() {
        return x + ":" + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        return y == position.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}