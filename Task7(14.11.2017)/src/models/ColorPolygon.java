package models;

import java.util.Arrays;

public class ColorPolygon extends Polygon implements Color {
    private int color;

    public ColorPolygon(Point[] arrayPoint, int color) throws IllegalArgumentException {
        super(arrayPoint);
        if (color < 0) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) throws IllegalArgumentException {
        if (color < 0) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPolygon{" +
                "color=" + color +
                ", arrayPoint=" + Arrays.toString(arrayPoint) +
                "} " + super.toString();
    }
}
