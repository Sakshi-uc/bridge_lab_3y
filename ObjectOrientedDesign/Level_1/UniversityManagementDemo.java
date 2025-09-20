import java.util.*;

class Professor {
    private String professorName;
    public Professor(String professorName){ this.professorName = professorName; }
    public String getProfessorName(){ return professorName; }
}

class CourseUMS {
    private String courseTitle;
    private Professor assignedProfessor;
    private List<StudentUMS> enrolledStudents = new ArrayList<>();
    public CourseUMS(String courseTitle){ this.courseTitle = courseTitle; }
    public void assignProfessor(Professor professor){ this.assignedProfessor = professor; }
    public void enroll(StudentUMS student){ enrolledStudents.add(student); }
    public void showDetails(){
        System.out.println("Course: " + courseTitle);
        if(assignedProfessor != null) System.out.println("Professor: " + assignedProfessor.getProfessorName());
        for(StudentUMS s: enrolledStudents) System.out.println(" - " + s.getStudentName());
    }
}

class StudentUMS {
    private String studentName;
    public StudentUMS(String studentName){ this.studentName = studentName; }
    public String getStudentName(){ return studentName; }
    public void enrollCourse(CourseUMS course){ course.enroll(this); }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        StudentUMS student1 = new StudentUMS("Karan");
        StudentUMS student2 = new StudentUMS("Meera");
        Professor professor = new Professor("Dr. Rao");
        CourseUMS algorithmsCourse = new CourseUMS("Algorithms");

        algorithmsCourse.assignProfessor(professor);
        student1.enrollCourse(algorithmsCourse);
        student2.enrollCourse(algorithmsCourse);

        algorithmsCourse.showDetails();
    }
}
