public class ColorLine extends Line implements Color {
    private int color;

    public ColorLine(Point beg, Point end, int color) {
        super(beg, end);
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
        return "ColorLine [color=" + color + ", Beg = " + getBeg() + ", End =" + getEnd() + "]";
    }
}
