package LanguageFeatures.GenericMethodsAndWildcards.GenericMethods;

public class TestGeneric {

    // define printArray method
    public static <E> void printArray(E[] lst) {
        for (E i : lst) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Integer[] arrInteger = {10, 20, 30, 40, 50, 60};
        Character[] arrChar = {'I', 'N', 'F', 'O', 'S', 'Y', 'S'};
        Double[] arrDouble = {100.1, 200.1, 300.1, 400.1, 500.1, 600.1};

        TestGeneric tg = new TestGeneric();
        tg.printArray(arrInteger);
        tg.printArray(arrChar);
        tg.printArray(arrDouble);
    }
}
