package StringBufferDemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        String firstName = "Sachin";
        String lastName = "Tendulkar";

        // '+'operator concatenates the string but creates a new object in the heap memory as sting is immutable
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // StringBuffer is mutable, it appends to a single object
        StringBuffer sb = new StringBuffer(firstName);
        sb.append(lastName);
        String fName = sb.toString();// toString method converts StringBuffer to String
        System.out.println(fName);
    }
}
