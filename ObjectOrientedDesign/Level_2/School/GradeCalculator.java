public class GradeCalculator {

    public String calculateGrade(Student student) {
        if (student.getSubjects().isEmpty()) {
            return "No subjects found!";
        }

        int totalMarks = 0;
        for (Subject sub : student.getSubjects()) {
            totalMarks += sub.getMarks();
        }

        double averageMarks = (double) totalMarks / student.getSubjects().size();

        if (averageMarks >= 90) return "A";
        else if (averageMarks >= 75) return "B";
        else if (averageMarks >= 50) return "C";
        else return "F";
    }
}
