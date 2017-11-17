import models.Line;
import models.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void createLineByCoordinates(){
        Line b = new Line(1,1,3,3);
        boolean result = b==null;
        boolean expected = false;
        assertEquals(result, expected);
    }

    @Test
    public void createLineByPoints(){
        Line b = new Line(new Point(1,1), new Point(3,3));
        boolean result = b==null;
        boolean expected = false;
        assertEquals(result, expected);
    }
}