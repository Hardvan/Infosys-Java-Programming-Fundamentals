package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Input a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Reverse the number
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            rev = rev * 10 + digit;
        }

        // Print the result
        System.out.println("Reverse of " + temp + " is " + rev);
    }
}
