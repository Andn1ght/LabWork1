package algorithms;

public class GCDFinder {

    /**
     * Computes the greatest common divisor (GCD) of two integers a and b.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     */
    public int findGCD(int a, int b) {

        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        } else {
            // Recursive case: Compute GCD(b, a % b)
            return findGCD(b, a % b);
        }
    }
}
