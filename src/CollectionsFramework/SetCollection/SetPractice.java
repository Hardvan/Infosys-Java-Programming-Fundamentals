package CollectionsFramework.SetCollection;

import java.util.Set;
import java.util.HashSet;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }

    // If we add two Student objects having the same rollNumber to the HashSet,
    // it should be considered as duplicate and should not get added.
    // So, we need to override the equals() and hashCode() methods.
    @Override
    public int hashCode() {
        return this.rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;
        return this.rollNumber == student.rollNumber;
    }
}

public class SetPractice {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Bob", 1));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));
        students.add(new Student("Dorothy", 3));

        for (Student student : students) {
            System.out.println(student); // toString() method will be called automatically.
        }
    }
}
