package tpmaven;

/**
 * This class contains a method to calculate the factorial.
 */
public class Main {

    /**
     * This method calculates the factorial of a given integer.
     * 
     * @param n The number whose factorial will be calculated
     * @return The factorial of the specified number as a long value
     */
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}