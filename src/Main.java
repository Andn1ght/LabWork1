import algorithms.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which problem do you want to solve?");
        System.out.println("---------------------------------------------");
        System.out.println("1. Find the minimum element");
        System.out.println("2. Find the average of the elements");
        System.out.println("3. Check if a number is prime");
        System.out.println("4. Find a factorial from the number");
        System.out.println("5. Find a n-th element in Fibonacci sequence");
        System.out.println("6. Calculate the power of a number");
        System.out.println("7. Reverse the array");
        System.out.println("8. Check whether the string is all consists of digits");
        System.out.println("9. Find binomial coefficient C(n,k)");
        System.out.println("10. Find GCD(a,b) of two numbers");
        System.out.println("---------------------------------------------");
        System.out.print("Enter the problem number: ");

        String pNum = input.nextLine();

        switch (pNum) {

            case "1":
                System.out.print("Enter the number of elements: ");
                int n = input.nextInt();

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr[i] = input.nextInt();
                }

                MinFinder minFinder = new MinFinder();
                int min = minFinder.findMin(arr, n);

                System.out.println("Minimum element is: " + min);
                break;
            case "2":
                System.out.print("Enter the number of elements: ");
                int n2 = input.nextInt();

                int[] arr2 = new int[n2];

                for (int i = 0; i < n2; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr2[i] = input.nextInt();
                }

                AverageFinder averageFinder = new AverageFinder();
                double avg = averageFinder.findAverage(arr2, n2);

                System.out.println("Average number is: " + avg);
                break;
            case "3":
                System.out.print("Enter a number: ");
                int num = input.nextInt();

                PrimeChecker primeChecker = new PrimeChecker();

                if (primeChecker.isPrime(num, 2)){
                    System.out.println(num + " is prime");
                } else {
                    System.out.println(num + " is composite");
                }
                break;
            case "4":
                System.out.print("Enter a number: ");
                int fctNum = input.nextInt();

                FactCalc fact = new FactCalc();

                int res = fact.fct(fctNum);

                System.out.println("Factorial of " + fctNum + " is " + res);
                break;
            case "5":
                System.out.print("Enter a number: ");
                int fibNum = input.nextInt();

                FibonacciSeq fibo = new FibonacciSeq();

                int res2 = fibo.fib(fibNum);

                System.out.println(fibNum + "-th element in Fibonacci sequence is " + res2);
                break;
            case "6":
                System.out.print("Enter a number that will be your base: ");
                int a = input.nextInt();
                System.out.print("Enter a number that will be your power of a number: ");
                int pow = input.nextInt();

                ExponentFinder exponent = new ExponentFinder();

                int res3 = exponent.exp(a, pow);

                System.out.println(a + " to the power of " + pow + " is: " + res3);
                break;
            case "7":
                System.out.print("Enter the number of elements: ");
                int n3 = input.nextInt();

                int[] arr3 = new int[n3];

                for (int i = 0; i < n3; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr3[i] = input.nextInt();
                }

                ReverseArray rvs = new ReverseArray();
                rvs.reverse(arr3, 0, n3-1);

                System.out.print("Reversed array is: ");
                for (int i = 0; i < n3; i++) {
                    System.out.print(arr3[i] + " ");
                }
                break;
            case "8":
                System.out.print("Print your string: ");
                String str = input.nextLine();

                DigitChecker dgt = new DigitChecker();

                if(dgt.isDigit(str)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            case "9":
                System.out.print("Enter 'n': ");
                int Cn = input.nextInt();
                System.out.print("Enter 'k': ");
                int Ck = input.nextInt();

                BinomialCoefficientFinder binomial = new BinomialCoefficientFinder();

                int result = binomial.binom(Cn, Ck);

                System.out.println("Binomial coefficient of C(" + Cn + "," + Ck + ") is " + result);
                break;
            case "10":
                System.out.print("Enter 'a': ");
                int gcd_a = input.nextInt();
                System.out.print("Enter 'b': ");
                int gcd_b = input.nextInt();

                GCDFinder gcdFinder = new GCDFinder();

                int gcd_result = gcdFinder.GCD(gcd_a, gcd_b);

                System.out.println("The GCD of " + gcd_a + " and " + gcd_b + " is " + gcd_result);
                break;
            default:
                System.out.println("Invalid problem number");
        }
    }
}