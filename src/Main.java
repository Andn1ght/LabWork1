import algorithms.AverageFinder;
import algorithms.MinFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which problem do you want to solve?");
        System.out.println("1. Find the minimum element");
        System.out.println("2. Find the average of the elements");
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
            default:
                System.out.println("Invalid problem number");
        }
    }
}