package algorithms;

public class ReverseArray {
    public void reverse(int[] arr, int a, int n){

        if (a >= n) return;

        int temp = arr[a];
        arr[a] = arr[n];
        arr[n] = temp;
        reverse(arr, a+1, n-1);

    }
}
