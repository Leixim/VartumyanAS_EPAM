import models.ColorPoint;
import org.junit.Test;

public class ColorPointTest {

    @Test(expected = IllegalArgumentException.class)
    public void setColorWithException(){
        boolean expected = true;
        boolean result;
        ColorPoint p1 = new ColorPoint(1,1,-1);
        ColorPoint p2 = new ColorPoint(1,1,1);
        p2.setColor(-1);
    }

    @Test
    public void setColor(){
        boolean expected = true;
        boolean result;
        ColorPoint p2 = new ColorPoint(1,1,1);
        p2.setColor(1);
    }

}