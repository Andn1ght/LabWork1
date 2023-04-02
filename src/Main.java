import algorithms.AverageFinder;
import algorithms.FactCalc;
import algorithms.MinFinder;
import algorithms.PrimeChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which problem do you want to solve?");
        System.out.println("1. Find the minimum element");
        System.out.println("2. Find the average of the elements");
        System.out.println("3. Check if a number is prime");
        System.out.println("4. Find a factorial from number");
        System.out.print("Enter the problem number: ");

        int pNum = input.nextInt();

        switch (pNum) {

            case 1:
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
            case 2:
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
            case 3:
                System.out.print("Enter a number: ");
                int num = input.nextInt();

                PrimeChecker primeChecker = new PrimeChecker();

                if (primeChecker.isPrime(num, 2)){
                    System.out.println(num + " is prime");
                } else {
                    System.out.println(num + " is composite");
                }
                break;
            case 4:
                System.out.print("Enter a number: ");
                int num2 = input.nextInt();

                FactCalc fact = new FactCalc();

                int result = fact.fct(num2);

                System.out.println("Factorial of " + num2 + " is " + result);
            default:
                System.out.println("Invalid problem number");
        }
    }
}