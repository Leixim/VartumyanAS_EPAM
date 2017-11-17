import models.ColorLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorLineTest {

    @Test(expected = IllegalArgumentException.class)
    public void createLineWithWrongColor() throws Exception {
        ColorLine line = new ColorLine(1,2,3,4,-1);
        int result = line.getColor();
        int expected = 5;
        assertEquals(result,expected);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setWrongColor() throws Exception {
        ColorLine line = new ColorLine(1,2,3,4,5);
        line.setColor(-1);
    }

    @Test
    public void setColor() throws Exception {
        ColorLine line = new ColorLine(1,2,3,4,5);
        int result = line.getColor();
        int expected = 5;
        assertEquals(result,expected);
    }

}