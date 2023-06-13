package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        displayList(1, 2, 3, 4, 5);
        maxOfList(1, 2, 3, 4, 5);
        sortList(4, 3, 2, 1, 5);
        averageList(1, 2, 3, 4, 5);
    }

    static void displayList(int... list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void maxOfList(int... list) {
        int max = list[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max: " + max);
    }

    static void sortList(int... list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }

            // Swapping
            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }

        displayList(list);
    }

    static void averageList(int... list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Average: " + (double) sum / list.length);
    }
}
