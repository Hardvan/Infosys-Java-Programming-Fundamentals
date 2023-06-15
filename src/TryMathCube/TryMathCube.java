package TryMathCube;

public class TryMathCube {

    public static int cube(int n) {
        return n * n * n;
    }


    public static void main(String[] args) {
        TryMathCube tc = new TryMathCube();
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("Cube of " + num + " = " + tc.cube(num));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
