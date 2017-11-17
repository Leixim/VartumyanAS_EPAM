package models;

public class ColorTriangle extends Triangle implements Color {
    private int color;

    public ColorTriangle(Point apexA, Point apexB, Point apexC, int color) throws IllegalArgumentException {
        super(apexA, apexB, apexC);
        if (color < 0) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color)throws IllegalArgumentException {
        if (color < 0) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorTriangle{" +
                "color=" + color +
                ", apexA=" + apexA +
                ", apexB=" + apexB +
                ", apexC=" + apexC +
                "} " + super.toString();
    }
}
