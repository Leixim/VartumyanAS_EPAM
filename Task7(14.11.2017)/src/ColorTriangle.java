public class ColorTriangle extends Triangle implements Color {
    private int color;

    public ColorTriangle(Point apexA, Point apexB, Point apexC, int color) {
        super(apexA, apexB, apexC);
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
        return "ColorTriangle{" +
                "color=" + color +
                ", apexA=" + apexA +
                ", apexB=" + apexB +
                ", apexC=" + apexC +
                ", sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideAC=" + sideAC +
                "} " + super.toString();
    }
}
