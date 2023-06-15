package PackagePractice.finance;

public class Bank {
    private String bankName; // Cannot be accessed outside of this class
    protected String area; // Can be accessed by classes in the same package and subclasses
    String phoneNo; // (default) Can be accessed by classes in the same package
    public int noOfEmployees; // Can be accessed by any class

    // Constructor must be public
    // otherwise it cannot instantiate Bank from outside package
    public Bank(String bankName, String area, String phoneNo, int noOfEmployees) {
        this.bankName = bankName;
        this.area = area;
        this.phoneNo = phoneNo;
        this.noOfEmployees = noOfEmployees;
    }

    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Area: " + area);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("No of Employees: " + noOfEmployees);
    }
}
