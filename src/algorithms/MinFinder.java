package algorithms;

public class MinFinder {

    /**
     * Finds the minimum value in an array of integers.
     *
     * @param arr the array of integers to search for the minimum value
     * @param n the number of elements in the array to consider
     * @return the minimum value in the array
     */
    public int findMin(int[] arr, int n) {

        // Base case: If n is 1, the minimum value is arr[0]
        if (n == 1) {
            return arr[0];
        } else {
            // Recursive case: Compute the minimum of arr[n-1] and the minimum of the first n-1 elements of arr
            return Math.min(arr[n-1], findMin(arr, n-1));
        }
    }
}
