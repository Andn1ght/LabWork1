package algorithms;

public class ExponentFinder {

    /**
     * Computes the value of a to the power of n.
     *
     * @param a the base value
     * @param n the exponent value
     * @return the value of a to the power of n
     */
    public int findExp(int a, int n){

        // Base case: if n is 0, the result is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: Compute a * findExp(a, n-1)
            return a * findExp(a, n-1);
        }
    }
}
