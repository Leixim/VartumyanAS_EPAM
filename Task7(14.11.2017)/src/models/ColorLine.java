package models;

public class ColorLine extends Line implements Color {
    private int color;

    public ColorLine(Point beg, Point end, int color) throws IllegalArgumentException {
        super(beg, end);
        if (color < 0) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }

    public ColorLine(int x1, int x2, int y1, int y2, int color) throws IllegalArgumentException {
        super(x1, x2, y1, y2);
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
        return "ColorLine [color=" + color +
                ", Beg = " + getBeg() +
                ", End =" + getEnd() + "]";
    }
}
