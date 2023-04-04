package algorithms;

public class FactCalc {

    /**
     * Computes the factorial of the given number n.
     *
     * @param n the number to compute the factorial of
     * @return the factorial of n
     */
    public int findFct(int n){

        // Base case: if n is 0 or 1, the result is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: Compute n * findFct(n - 1)
            return n * findFct(n - 1);
        }
    }
}
