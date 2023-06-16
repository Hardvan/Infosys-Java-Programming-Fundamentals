package CollectionsFramework.MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }
}

class MapInterface {
    public static void main(String[] args) {
        Set<Course> courseSet1 = new HashSet<>();
        courseSet1.add(new Course("Java"));
        courseSet1.add(new Course("DBMS"));

        Set<Course> courseSet2 = new HashSet<>();
        courseSet2.add(new Course("PHP"));
        courseSet2.add(new Course("HTML"));
        courseSet2.add(new Course("CSS"));

        // Creating a Map of studentID and Set of Courses
        Map<Integer, Set<Course>> studentCourses = new HashMap<>();
        studentCourses.put(1001, courseSet1);
        studentCourses.put(1002, courseSet2);

        System.out.println("Retrieving the set of Courses by studentID (1001): ");
        Set<Course> courseSet = studentCourses.get(1001);
        System.out.println(courseSet);
        System.out.println();

        System.out.println("Iterating over the set of keys using for-each loop: ");
        Set<Integer> setOfKeys = studentCourses.keySet();
        for (Integer key : setOfKeys) {
            System.out.print(key + ": ");
            System.out.println(studentCourses.get(key));
        }
        System.out.println();

        System.out.println("Iterating over the collection using values() method: ");
        for (Set<Course> courses : studentCourses.values()) {
            System.out.println(courses);
        }
    }
}
