import java.util.Arrays;

public class Polygon {
    Point[] arrayPoint;
    Line[] arrayLine = new Line[arrayPoint.length];

    public Polygon(Point[] arrayPoint, Line[] arrayLine) {
        this.arrayPoint = arrayPoint;
        this.arrayLine = arrayLine;
    }

    public Point[] getArrayPoint() {
        return arrayPoint;
    }

    public void setArrayPoint(Point[] arrayPoint) {
        this.arrayPoint = arrayPoint;
    }

    public Line[] getArrayLine() {
        return arrayLine;
    }

    public void setArrayLine(Line[] arrayLine) {
        this.arrayLine = arrayLine;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "arrayPoint=" + Arrays.toString(arrayPoint) +
                ", arrayLine=" + Arrays.toString(arrayLine) +
                '}';
    }
}
