package AverageArray;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        // Getting Array as Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        double avg = 0.0;
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        avg /= n;

        System.out.println("Average is: " + avg);
    }
}
