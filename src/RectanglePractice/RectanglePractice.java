package RectanglePractice;

class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(20);
        
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());
    }
}
