package models;

import java.util.Arrays;

public class Polygon extends Figure{
    Point[] arrayPoint;

    public Polygon(Point[] arrayPoint) throws IllegalArgumentException {
        if (arrayPoint.length < 4) {
            throw new IllegalArgumentException("Invalid size of polygon");
        }
        this.arrayPoint = arrayPoint;
    }

    public Point[] getArrayPoint() {
        return arrayPoint;
    }

    public void setArrayPoint(Point[] arrayPoint) throws IllegalArgumentException {
        if (arrayPoint.length < 4) {
            throw new IllegalArgumentException("Invalid size of polygon");
        }
        this.arrayPoint = arrayPoint;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "arrayPoint=" + Arrays.toString(arrayPoint) +
                '}';
    }
}
