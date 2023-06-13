package InheritancePractice;

class Employee {
    int empId;
    String name;
    double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PermanentEmployee extends Employee {
    double basicPay;
    double hra;
    int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calcSalary() {
        // Salary = Variable Component + Basic Pay + HRA
        int percentage;
        if (this.experience < 3) {
            percentage = 0;
        } else if (this.experience < 5) {
            percentage = 5;
        } else if (this.experience < 10) {
            percentage = 7;
        } else {
            percentage = 12;
        }

        this.salary = (this.basicPay * percentage / 100) + this.basicPay + this.hra;

        System.out.println("Salary of " + this.name + " is " + this.salary);
    }
}

class ContractEmployee extends Employee {
    double wages;
    int hours;

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calcSalary() {
        // Salary = Wages * Hours
        this.salary = this.wages * this.hours;
        System.out.println("Salary of " + this.name + " is " + this.salary);
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        PermanentEmployee obj1 = new PermanentEmployee();
        obj1.setName("Anil");
        obj1.setEmpId(101);
        obj1.setBasicPay(10000);
        obj1.setHra(1500);
        obj1.setExperience(3);
        obj1.calcSalary();

        ContractEmployee obj2 = new ContractEmployee();
        obj2.setName("Ankit");
        obj2.setEmpId(102);
        obj2.setWages(500);
        obj2.setHours(10);
        obj2.calcSalary();
    }
}
