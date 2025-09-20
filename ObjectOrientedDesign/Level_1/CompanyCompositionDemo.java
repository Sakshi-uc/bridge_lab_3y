import java.util.*;

class Employee {
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

class Department {
    private String departmentName;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee(Employee employeeObj) {
        employeeList.add(employeeObj);
    }

    public void displayEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee employeeObj : employeeList) {
            System.out.println(" - " + employeeObj.getEmployeeName());
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departmentList = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department departmentObj) {
        departmentList.add(departmentObj);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department departmentObj : departmentList) {
            departmentObj.displayEmployees();
        }
    }
}

public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company companyObj = new Company("TechCorp");

        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        itDept.addEmployee(new Employee("Alice"));
        itDept.addEmployee(new Employee("Bob"));
        hrDept.addEmployee(new Employee("Charlie"));

        companyObj.addDepartment(itDept);
        companyObj.addDepartment(hrDept);

        companyObj.displayCompanyDetails();
    }
}
