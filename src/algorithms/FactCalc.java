package algorithms;

public class FactCalc {
    public static int fct(int n){

        if (n == 0|| n == 1) return 1;

        return n * fct(n - 1);

    }
}
