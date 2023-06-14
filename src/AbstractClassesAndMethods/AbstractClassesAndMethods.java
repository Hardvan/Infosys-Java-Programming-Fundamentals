package AbstractClassesAndMethods;

abstract class RRPaymentServices {
    double balance;
    int customerID;

    RRPaymentServices(double balance, int customerID) {
        this.balance = balance;
        this.customerID = customerID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public abstract void payBill(double amount); // OR abstract public void payBill(double amount);
}

class ShoppingPayment extends RRPaymentServices {
    static int counter;
    String paymentID;

    ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
        // payment id should start with 'S' followed by a four digit integer number.
        this.paymentID = "S" + String.format("%04d", ++counter);
    }

    public String getPaymentID() {
        return this.paymentID;
    }

    public void payBill(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Payment successful");
        }
    }
}

class CreditCardPayment extends RRPaymentServices {
    static int counter;
    String paymentID;
    double cashBack;
    double balanceDue;

    CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);
        // payment id should start with 'C' followed by a four digit integer number.
        this.paymentID = "C" + String.format("%04d", ++counter);
    }

    public String getPaymentID() {
        return this.paymentID;
    }

    public double getCashBack() {
        return this.cashBack;
    }

    public double getBalanceDue() {
        return this.balanceDue;
    }

    //For credit card bill payment,
    // if a user enters an amount more than the amount to be paid,
    // the excess amount should be stored as cashBack.
    // The payBill method is used to pay the bill and generate the transaction id.
    // The id should start with 'C' followed by a four-digit integer number.
    // In case the user enters an amount less than the amount to be paid,
    // then the remaining amount should be stored in the instance variable balanceDue of class CreditCardPayment.
    public void payBill(double amount) {
        if (amount > this.balance) {
            this.cashBack = amount - this.balance;
            this.balance = 0;
            System.out.println("Payment successful");
        } else {
            this.balanceDue = this.balance - amount;
            this.balance = 0;
            System.out.println("Payment successful");
        }
    }
}

public class AbstractClassesAndMethods {
    public static void main(String[] args) {
        CreditCardPayment c1 = new CreditCardPayment(10000.23, 5001);
        c1.payBill(15000);
        System.out.println("Customer ID: " + c1.getCustomerID());
        System.out.println("Payment ID: " + c1.getPaymentID());
        System.out.println("Balance: " + c1.getBalance());
        System.out.println("Cashback: " + c1.getCashBack());
        System.out.println("Balance Due: " + c1.getBalanceDue());
    }
}
