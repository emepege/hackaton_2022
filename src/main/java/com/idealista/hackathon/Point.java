package com.idealista.hackathon;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Point implements Serializable {

    private static final List<Point> nearPointsVector = Arrays.asList(
            new Point(1,1), new Point(1,0), new Point(1,-1), new Point(0,1),
            new Point(0,-1), new Point(-1,1), new Point(-1,0), new Point(-1,-1)
    );

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point clone() {
        return new Point(x, y);
    }

    public List<Point> nearPoints() {
        return nearPointsVector.stream()
                .map(vector -> new Point(x + vector.x, y + vector.y))
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + '}';
    }
}
