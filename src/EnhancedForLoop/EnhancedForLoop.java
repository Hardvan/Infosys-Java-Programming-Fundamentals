package EnhancedForLoop;

import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];

        storeMarks(arr);

        displayMarks(arr);
    }

    public static void storeMarks(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + arr.length + " marks: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayMarks(int[] arr) {
        System.out.println("Marks are:");
        for (int mark : arr) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
