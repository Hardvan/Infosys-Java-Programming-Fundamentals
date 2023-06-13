package ArmstrongAndLucky;

import java.util.Scanner;

public class ArmstrongAndLucky {
    public static void main(String[] args) {
        int choice = getChoice();
        int n = getNumber();
        boolean check;
        switch (choice) {
            // Armstrong
            case 1:
                check = isArmstrong(n);
                if (check) {
                    System.out.println(n + " is Armstrong");
                } else {
                    System.out.println(n + " is not Armstrong");
                }
                break;

            // Lucky
            case 2:
                check = isLucky(n);
                if (check) {
                    System.out.println(n + " is Lucky");
                } else {
                    System.out.println(n + " is not Lucky");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("1) Armstrong");
            System.out.println("2) Lucky");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        } while (!(choice == 1 || choice == 2));

        return choice;
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        return n;
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += (digit * digit * digit);
        }

        return sum == temp;
    }

    public static boolean isLucky(int n) {
        // ? Lucky Number: Sum of squares of digits starting from 2nd position (from left) is divisible by 9
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            rev = rev * 10 + digit;
        }

        int sum = 0;
        boolean flag = false;
        while (rev > 0) {
            int digit = rev % 10;
            rev /= 10;

            // Even Position
            if (flag) {
                sum += digit * digit;
            }

            // Toggle
            flag = !flag;
        }

        return sum % 9 == 0;
    }

}
