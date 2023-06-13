package PerformanceRating;

class Employee {
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

public class PerformanceRating {
    private static final int OUTSTANDING = 5, GOOD = 4, AVERAGE = 3, POOR = 2;

    static int calcPerformance(Employee employee) {
        int point = employee.getPoint();
        if (point > 100) {
            System.out.println("Invalid point");
            return 0;
        }

        if (point >= 80) {
            return OUTSTANDING;
        } else if (point >= 60) {
            return GOOD;
        } else if (point >= 50) {
            return AVERAGE;
        } else if (point >= 1) {
            return POOR;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setPoint(85);

        Employee employee2 = new Employee();
        employee2.setPoint(70);

        Employee employee3 = new Employee();
        employee3.setPoint(55);

        int rating1 = PerformanceRating.calcPerformance(employee1);
        int rating2 = PerformanceRating.calcPerformance(employee2);
        int rating3 = PerformanceRating.calcPerformance(employee3);

        System.out.println("Employee 1 Performance Rating: " + rating1);
        System.out.println("Employee 2 Performance Rating: " + rating2);
        System.out.println("Employee 3 Performance Rating: " + rating3);
    }
}
