package algorithms;

public class ExponentFinder {
    public int exp(int a, int n){

        if (n == 0)
            return 1;
        else
            return a * exp(a, n-1);

    }
}
