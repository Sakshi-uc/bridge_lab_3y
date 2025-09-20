import java.util.*;

class Faculty {
    private String facultyName;
    public Faculty(String facultyName) { this.facultyName = facultyName; }
    public String getName() { return facultyName; }
}

class DepartmentU {
    private String departmentName;
    public DepartmentU(String departmentName) { this.departmentName = departmentName; }
    public String getDeptName() { return departmentName; }
}

class University {
    private String universityName;
    private List<DepartmentU> departmentList = new ArrayList<>();
    private List<Faculty> facultyList = new ArrayList<>();
    public University(String universityName) { this.universityName = universityName; }
    public void addDepartment(DepartmentU dept) { departmentList.add(dept); }
    public void addFaculty(Faculty fac) { facultyList.add(fac); }
    public void showDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (DepartmentU d : departmentList) System.out.println(" - " + d.getDeptName());
        System.out.println("Faculties:");
        for (Faculty f : facultyList) System.out.println(" - " + f.getName());
    }
}

public class UniversityCompositionAggregationDemo {
    public static void main(String[] args) {
        University uni = new University("Delhi University");
        uni.addDepartment(new DepartmentU("CS"));
        uni.addDepartment(new DepartmentU("Physics"));
        uni.addFaculty(new Faculty("Dr. Mehta"));
        uni.addFaculty(new Faculty("Prof. Rao"));

        uni.showDetails();
    }
}
