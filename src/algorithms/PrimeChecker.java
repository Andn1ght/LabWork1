package algorithms;

public class PrimeChecker {
    public boolean isPrime(int n, int i){

        if (n == 1 || n == 0) return false;
        if (n == i) return true;

        if (n % i == 0) return false;

        return isPrime(n, i+1);

    }
}
