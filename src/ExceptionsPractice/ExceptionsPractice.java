package ExceptionsPractice;

// ? Custom Exception Class
class EmpSalaryException extends Exception {
    public EmpSalaryException(String message) {
        super(message);
    }
}

class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}

public class ExceptionsPractice {

    public static void checkSalary(Employee emp) throws EmpSalaryException {
        if (emp.getEmpSalary() < 1000) {
            throw new EmpSalaryException("Salary is less than 1000");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25, 500);
        Employee e2 = new Employee("Mary", 27, 2000);
        Employee e3 = new Employee("Mike", 30, 1500);
        Employee e4 = new Employee("Jane", 35, 800);
        Employee e5 = new Employee("Mark", 40, 1200);
        Employee[] emp_arr = {e1, e2, e3, e4, e5};

        for (Employee emp : emp_arr) {
            try {
                checkSalary(emp);
            } catch (EmpSalaryException e) {
                System.out.println(e.getMessage());
                System.out.println("Employee Name: " + emp.getEmpName());
            }
        }
    }
}
