package test.com.rohitlearns.mysql.test;

import static org.junit.Assert.assertEquals;

import com.rohitlearns.mysql.Conversion;
import org.junit.*;

public class ConversionTest {

    @Test
    public void testTempConversion() {

        Conversion underTest = new Conversion();
        double temp = 80.0d;
        String unit = "";
        double result = underTest.tempConv(temp,unit);
        assertEquals(176.0d,result,0.0);
    }

}
