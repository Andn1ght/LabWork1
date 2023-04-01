package algorithms;

public class AverageFinder {
    public double findAverage(int[] arr, int n){

        if (n == 0) return 0;
        else{
            double prev = findAverage(arr, n-1);
            return (prev * (n-1) + arr[n-1]) / n;
        }
    }
}
