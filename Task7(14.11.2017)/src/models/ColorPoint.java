package models;

public class ColorPoint extends Point implements Color{

    private int color;

    public ColorPoint(int x, int y, int color) throws IllegalArgumentException {
        super(x, y);
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
        return "ColorPoint{" + "color=" +
                color + ", X=" +
                getX() + ", Y="
                + getY() + '}';
    }
}
