package GenericsDemo;

// Generics allow us to create classes that can work with any data type.
class Record<E> {
    private E record;

    public void display(E item) {
        System.out.println(item);
    }
}

class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return "Student: Id = " + studentId + " Name = " + studentName;
    }
}

class GenericsDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Robert");

        Record<Integer> integerRecord = new Record<Integer>(); // display only integers
        integerRecord.display(12);
        // integerRecord.display(s1); will give an error as we are trying to add a student class object

        Record<Student> studentRecord = new Record<Student>();  //display only Students
        studentRecord.display(s1);
        // studentRecord.display(15); will give an error as we are trying to add an integer
    }
}
