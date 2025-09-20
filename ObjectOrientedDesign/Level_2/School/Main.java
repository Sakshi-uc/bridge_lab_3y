public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));
        student.addSubject(new Subject("English", 78));

        GradeCalculator gradeCalculator = new GradeCalculator();
        String finalGrade = gradeCalculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject subject : student.getSubjects()) {
            System.out.println(" - " + subject.getName() + ": " + subject.getMarks());
        }
        System.out.println("Final Grade: " + finalGrade);
    }
}
