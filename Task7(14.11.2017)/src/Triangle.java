public class Triangle {
    Point apexA, apexB, apexC;
    Line sideAB, sideBC, sideAC;

    public Triangle(Point apexA, Point apexB, Point apexC) {
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
    }

    public Line getSideAB() {
        if (sideAB == null) sideAB = new Line(apexA, apexB);
        return sideAB;
    }

    public void setApexA(Point p) {
        apexA = p;
        sideAB = null;
        sideAC = null;
    }

    public Line getSideBC() {
        if (sideBC == null) sideBC = new Line(apexB, apexC);
        return sideAB;
    }

    public void setApexB(Point p) {
        apexB = p;
        sideAB = null;
        sideBC = null;
    }

    public Line getSideAC() {
        if (sideAC == null) sideAC = new Line(apexA, apexC);
        return sideAB;
    }

    public void setApexC(Point p) {
        apexC = p;
        sideAB = null;
        sideAC = null;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "apexA=" + apexA +
                ", apexB=" + apexB +
                ", apexC=" + apexC +
                ", sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideAC=" + sideAC +
                '}';
    }
}
