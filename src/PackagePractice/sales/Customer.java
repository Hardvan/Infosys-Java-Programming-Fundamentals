package PackagePractice.sales;

import PackagePractice.finance.Bank;

public class Customer {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America", "New York", "1234567890", 1000);
        // System.out.println(bank.bankName); // Cannot access private variable
        // System.out.println(bank.area); // Cannot access protected variable
        // System.out.println(bank.phoneNo); // Cannot access default variable
        System.out.println(bank.noOfEmployees); // Can access public variable

        bank.displayBankDetails();
    }
}
