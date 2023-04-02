package algorithms;

public class ReverseArray {
    public void reverse(int[] arr, int first, int last){

        if (first >= last) return;

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        reverse(arr, first+1, last-1);

    }
}
