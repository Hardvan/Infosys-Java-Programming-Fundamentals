package LanguageFeatures.GenericMethodsAndWildcards.Wildcards;

import java.util.ArrayList;
import java.util.List;

class Record<E> {
    List<E> record = new ArrayList<>();

    @Override
    public String toString() {
        return "Record [record = " + record + "]";
    }

    public void add(E e) {
        record.add(e); // ArrayList Function
    }

    public void display(Record<? extends Student> record) {
        System.out.println("Student Record:" + record);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id = " + id + " Name = " + name;
    }
}

class Dayscholar extends Student {
    float stipend;

    public Dayscholar(int id, String name, float stipend) {
        super(id, name);
        this.stipend = stipend;
    }

    @Override
    public String toString() {
        return "Id = " + id + " Name = " + name + " Stipend = " + stipend;
    }
}

class WildcardsDemo {
    public static void main(String[] args) {
        Record<Student> studentrecord = new Record<>();
        Student student = new Student(101, "Adam");

        Record<Dayscholar> dayscholaarecord = new Record<>();
        Dayscholar dayscholar = new Dayscholar(102, "Robert", 10000f);

        studentrecord.add(student);
        studentrecord.display(studentrecord);

        dayscholaarecord.add(dayscholar);
        dayscholaarecord.display(dayscholaarecord);
    }
}

