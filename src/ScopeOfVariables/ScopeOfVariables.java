package ScopeOfVariables;

public class ScopeOfVariables {
    int i = 42; // Instance variable
    static int j; // Static variable

    static {
        j = 101;
        System.out.println("Inside static block: " + j);
    }

    void test() {
        int k = 200; // Local variable
        System.out.println("Local variable k: " + k);
    }

    public static void main(String[] args) {
        ScopeOfVariables obj = new ScopeOfVariables();
        System.out.println("Instance variable i: " + obj.i);
        System.out.println("Static variable j: " + j);
        obj.test();
    }
}
