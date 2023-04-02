package algorithms;

public class FactCalc {
    public int fct(int n){

        if (n == 0|| n == 1) return 1;

        return n * fct(n - 1);

    }
}
