package models;

public class Triangle extends Figure {
    Point apexA, apexB, apexC;
    Line sideAB, sideBC, sideAC;
    private double trianglePerimetr;
    private double triangleArea;

    public Triangle(Point apexA, Point apexB, Point apexC) throws IllegalArgumentException {
        if (apexA == null || apexA == null || apexC == null || apexA.equals(apexB)
                || apexA.equals(apexC) || apexB.equals(apexC)) {
            throw new IllegalArgumentException("Invalid triangle");
        }
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
    }

    public Line getSideAB() {
        if (sideAB == null) sideAB = new Line(apexA, apexB);
        return sideAB;
    }

    public Line getSideBC() {
        if (sideBC == null) sideBC = new Line(apexB, apexC);
        return sideAB;
    }

    public Line getSideAC() {
        if (sideAC == null) sideAC = new Line(apexA, apexC);
        return sideAB;
    }

    public void setApexA(Point p) {
        apexA = p;
        sideAB = null;
        sideAC = null;
    }

    public void setApexB(Point p) {
        apexB = p;
        sideAB = null;
        sideBC = null;
    }

    public void setApexC(Point p) {
        apexC = p;
        sideAB = null;
        sideAC = null;
    }

    public Point getApexA() {
        return apexA;
    }

    public Point getApexB() {
        return apexB;
    }

    public Point getApexC() {
        return apexC;
    }

    public double getTrianglePerimetr() {
        this.trianglePerimetr = getSideAB().length() + getSideBC().length() + getSideAC().length();
        return trianglePerimetr;
    }

    public double getTriangleArea() {
        double p = getTrianglePerimetr() / 2;
        this.triangleArea = Math.sqrt(p * (p - getSideAC().length()) * (p - getSideAB().length()) * (p - getSideBC().length()));
        return triangleArea;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "apexA=" + apexA +
                ", apexB=" + apexB +
                ", apexC=" + apexC +
                '}';
    }
}
