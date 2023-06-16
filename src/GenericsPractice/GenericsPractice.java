package GenericsPractice;

class SimpleGeneric<T> {
    private T obj;

    public SimpleGeneric(T obj) {
        this.obj = obj;
    }

    public void showObjectType() {
        String type = obj.getClass().getName();
        System.out.println("Type of " + obj + " is: " + type);
    }
}

public class GenericsPractice {
    public static void main(String[] args) {
        SimpleGeneric<String> s1 = new SimpleGeneric<String>("Hello");
        s1.showObjectType();

        SimpleGeneric<Integer> s2 = new SimpleGeneric<Integer>(100);
        s2.showObjectType();
    }
}
