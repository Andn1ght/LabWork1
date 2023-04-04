package algorithms;

public class ReverseArray {

    /**
     * Reverses the elements of the given array recursively using two pointers.
     *
     * @param arr the array to be reversed
     * @param first the index of the first element
     * @param last the index of the last element
     */
    public void reverseArr(int[] arr, int first, int last){

        // base case: if first index is greater than or equal to the last index, the array is already reversed
        if (first >= last) return;

        // swap the first and last elements
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        // recursively call the function with the next pair of indices
        reverseArr(arr, first+1, last-1);

    }
}
