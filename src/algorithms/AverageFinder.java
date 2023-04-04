package algorithms;

public class AverageFinder {

    /**
     * Computes the average of the first n elements in the given array.
     *
     * @param arr an array of integers
     * @param n the number of elements in the array to include in the average
     * @return the average of the first n elements in the array, or 0 if n is 0
     */
    public double findAverage(int[] arr, int n){

        // Check if there are any elements in the array
        // Base case: if n or length of array is equal to 0, return 0
        if (n == 0) {
            return 0;
        } else {
            // Compute the average of the first n-1 elements recursively
            double prev = findAverage(arr, n-1);
            // Compute the average of all n elements using the formula:
            // (prev * (n-1) + arr[n-1]) / n
            // and then returns the result of this calculations
            return (prev * (n-1) + arr[n-1]) / n;
        }
    }
}
