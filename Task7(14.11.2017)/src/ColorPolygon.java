import java.util.Arrays;

public class ColorPolygon extends Polygon implements Color {
    private int color;

    public ColorPolygon(Point[] arrayPoint, Line[] arrayLine, int color) {
        super(arrayPoint, arrayLine);
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
        return "ColorPolygon{" +
                "color=" + color +
                ", arrayPoint=" + Arrays.toString(arrayPoint) +
                ", arrayLine=" + Arrays.toString(arrayLine) +
                "} " + super.toString();
    }
}
