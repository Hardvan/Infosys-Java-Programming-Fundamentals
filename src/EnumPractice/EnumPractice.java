package EnumPractice;

enum Grade {
    A, B, C, D, E
}

class Student {
    int studentId;
    String name;
    Grade grade;
    int scholarshipAmount;
    int totalMarks;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateGrade() {
        if (totalMarks >= 250) {
            grade = Grade.A;
        } else if (totalMarks >= 200) {
            grade = Grade.B;
        } else if (totalMarks >= 175) {
            grade = Grade.C;
        } else if (totalMarks >= 150) {
            grade = Grade.D;
        } else {
            grade = Grade.E;
        }
    }

    public void calculateScholarshipAmount() {
        switch (grade) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }
    }
}

public class EnumPractice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1000);
        s1.setName("Alvin");
        s1.setTotalMarks(280);
        s1.calculateGrade();
        s1.calculateScholarshipAmount();

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student ID: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Grade: " + s1.getGrade());
        System.out.println("Student Scholarship Amount: " + s1.getScholarshipAmount());
    }
}
