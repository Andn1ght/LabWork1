package algorithms;

public class PrimeChecker {

    /**
     * Checks whether a given number is prime.
     *
     * @param n the number to check for primality
     * @param i the current divisor being checked
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int n, int i){

        // Base cases: 0 and 1 are not prime numbers
        if (n == 1 || n == 0) {
            return false;
        }
        // Base case: n is prime if the current divisor i is equal to n
        if (n == i) {
            return true;
        }

        // Check if n is divisible by i, if yes then n is not a prime number
        if (n % i == 0) {
            return false;
        }

        // Recursively check if n is divisible by any other divisor between i and n/2
        return isPrime(n, i+1);

    }
}
