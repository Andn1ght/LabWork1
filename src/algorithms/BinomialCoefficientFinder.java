package algorithms;

public class BinomialCoefficientFinder {

    /**
     * Computes the binomial coefficient of n choose k.
     *
     * @param n an integer representing the total number of items
     * @param k an integer representing the number of items to choose
     * @return the binomial coefficient of n choose k
     */
    public int findBinomCoeff(int n, int k){

        // Base case: If k is 0 or k equals n, return 1
        if (k == 0 || k == n) {
            return 1;
        } else {
            // Recursive case: Compute C(n-1, k-1) + C(n-1, k)
            return findBinomCoeff(n-1, k-1) + findBinomCoeff(n-1, k);
        }
    }
}
