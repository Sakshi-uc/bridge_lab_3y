public class Subject {
    private String subjectName;
    private int subjectMarks;

    public Subject(String subjectName, int subjectMarks) {
        this.subjectName = subjectName;
        this.subjectMarks = subjectMarks;
    }

    public String getName() {
        return subjectName;
    }

    public int getMarks() {
        return subjectMarks;
    }
}
