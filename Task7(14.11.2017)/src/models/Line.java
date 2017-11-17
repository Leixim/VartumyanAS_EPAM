package models;

public class Line extends Figure {
    private Point beg;
    private Point end;

    public Line(Point beg, Point end) throws IllegalArgumentException {
        this.beg = beg;
        this.end = end;
        if (beg == null || end == null || beg.equals(end)) {
            throw new IllegalArgumentException("Invalid line");
        }
    }

    public Line(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
        this.beg = new Point(x1, y1);
        this.end = new Point(x2, y2);
        if (beg == null || end == null || beg.equals(end)) {
            throw new IllegalArgumentException("Invalid line");
        }

    }

    public Point getBeg() {
        return beg;
    }

    public void setBeg(Point beg) {
        this.beg = beg;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    double length(){
        return Math.sqrt(Math.pow(beg.getX()-end.getX(),2d)+Math.pow(beg.getY()-end.getY(),2d));
    }

    @Override
    public String toString() {
        return "Line{" +
                "beg=" + beg +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!beg.equals(line.beg)) return false;
        return end.equals(line.end);
    }

    @Override
    public int hashCode() {
        int result = beg.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }
}
