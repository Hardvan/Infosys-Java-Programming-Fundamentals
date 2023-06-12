package IntroToClassesAndObjects;

// ? Only one public class per file

class Account {
    // Attributes
    private double balance = 123456;

    // Methods
    public double getBalance(int accountId) {
        return balance;
    }
}

public class IntroToClassesAndObjects {
    public static void main(String[] args) {
        // Create an instance of the Account class
        Account acc = new Account();

        // Call the getBalance method
        double balance = acc.getBalance(123456789);
        System.out.println("Balance: " + balance);

    }
}