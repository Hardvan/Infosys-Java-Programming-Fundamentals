package LanguageFeatures.GenericMethodsAndWildcards.GenericMethods;

public class GenericMethods {
    // ? Generic Method
    public static <E> void display(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + ", ");
        }
    }

    public static void main(String[] args) {
        String[] cities = {"Bengaluru", "Chennai"};
        Integer[] codes = {12, 14, 15};
        display(codes);
        display(cities);
    }
}
