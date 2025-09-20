import java.util.*;

class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) { this.courseName = courseName; }

    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public void showEnrolled() {
        System.out.println("Course: " + courseName);
        for (Student student : students) System.out.println(" - " + student.getName());
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public String getName() { return name; }

    public void addCourse(Course course) { courses.add(course); }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course course : courses) System.out.println(" - " + course.courseName);
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public void addStudent(Student student) { students.add(student); }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student student : students) System.out.println(" - " + student.getName());
    }
}

public class SchoolAggregationAssociationDemo {
    public static void main(String[] args) {
        School school = new School("Springfield High");
        Student student1 = new Student("Rahul");
        Student student2 = new Student("Priya");

        school.addStudent(student1);
        school.addStudent(student2);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        course1.enrollStudent(student1);
        course2.enrollStudent(student1);
        course2.enrollStudent(student2);

        school.showStudents();
        student1.showCourses();
        course2.showEnrolled();
    }
}
