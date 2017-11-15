public class ColorPoint extends Point {

    private int color;

    public ColorPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(Point p, int color) {
        super(p);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "color=" + color +
                "} " + super.toString();
    }
}