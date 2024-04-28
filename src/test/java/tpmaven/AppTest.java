package tpmaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testCalculateFactorial() {
        int number = 5; 
        long expectedFactorial = 120;

        long actualFactorial = Main.calculateFactorial(number);

        Assert.assertEquals(actualFactorial, expectedFactorial, "العاملي غير متطابق. المتوقع: " + expectedFactorial + ", الفعلي: " + actualFactorial);
    }
}
