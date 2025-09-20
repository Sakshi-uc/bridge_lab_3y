import java.util.*;

public class EmployeeBonus {
    // Generate random salaries and years of service for n employees
    static double[][] generateSalariesAndServiceYears(int numEmployees) {
        double[][] employeeData = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + (int) (Math.random() * 90000); // Salary between 10,000-99,999
            employeeData[i][1] = (int) (Math.random() * 16); // Years of service between 0-15
        }
        return employeeData;
    }

    // Calculate new salaries and bonuses
    static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [newSalary, bonus]
        for (int i = 0; i < n; i++) {
            double oldSalary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            result[i][0] = oldSalary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] baseData = generateSalariesAndServiceYears(numEmployees);
        double[][] updatedData = calculateNewSalaryAndBonus(baseData);

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-4s %-10s %-6s %-12s %-12s%n", "ID", "OldSalary", "Years", "NewSalary", "Bonus");
        for (int i = 0; i < numEmployees; i++) {
            totalOldSalary += baseData[i][0];
            totalNewSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            System.out.printf("%-4d %-10.0f %-6.0f %-12.0f %-12.0f%n",
                    i + 1, baseData[i][0], baseData[i][1], updatedData[i][0], updatedData[i][1]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total Old Salary: %.0f | Total New Salary: %.0f | Total Bonus: %.0f%n",
                totalOldSalary, totalNewSalary, totalBonus);
    }
}
