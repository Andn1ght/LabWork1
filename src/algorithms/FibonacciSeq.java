package algorithms;

public class FibonacciSeq {

    /**
     * Computes the n-th number in the Fibonacci sequence.
     *
     * @param n the index of the number to compute in the sequence
     * @return the n-th number in the Fibonacci sequence
     */
    public int findFib(int n){

        // Base case: if n is 0 or 1, the result is n
        if (n <= 1) {
            return n;
        } else {
            // Recursive case: Compute findFib(n-1) + findFib(n-2)
            return findFib(n-1) + findFib(n-2);
        }
    }
}
