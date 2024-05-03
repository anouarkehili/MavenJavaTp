package tpmaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    /**
     * This method tests the calculateFactorial method in the Main class.
     */
    @Test
    public void testCalculateFactorial() {
        // Given
        int number = 5; // The number to calculate its factorial
        long expectedFactorial = 120; // The expected factorial for the given number

        // When
        long actualFactorial = Main.calculateFactorial(number); // Calculate the factorial of the given number

        // Then
        // Assert that the actual factorial matches the expected factorial
        Assert.assertEquals(actualFactorial, expectedFactorial, "The factorials do not match. Expected: " + expectedFactorial + ", Actual: " + actualFactorial);
    }
}