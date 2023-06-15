package WrapperClass;


public class WrapperClassTester {
    public static void main(String[] args) {
        int i = 45; // primitive data int
        Integer integer = new Integer(i);// Integer wrapper class instantiation

        int i2 = integer.intValue();// unwrapping primitive data int from wrapper object
        // OR
        // int i2 = integer; // auto unboxing
        Integer integer2 = new Integer("23");

        // all wrapper class except Character can take String in argument
        System.out.println(integer2);
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);

        System.out.println("Obj1: " + intObj1);
        System.out.println("Obj2: " + intObj2);
        System.out.println("Obj3: " + intObj3);

        //compareTo demo
        System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));

        // Equals demo
        System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
        System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));

        // Float wrapper class
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("Comparing using compare f1 and f2: " + Float.compare(f1, f2));
        System.out.println("Comparing using compare f1 and f3: " + Float.compare(f1, f3));

        // Addition of Integer with Float
        Float f = intObj1.floatValue() + f1;
        System.out.println("Addition of intObj1 and f1: " + intObj1 + " + " + f1 + " = " + f);

        // Double wrapper class
        double y = Double.parseDouble("34.7");
        System.out.println(y);
    }
}



