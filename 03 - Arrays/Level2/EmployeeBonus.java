import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            while (true) {
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                System.out.print("Years of Service: ");
                int years = sc.nextInt();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input! ");
                }
            }
        }

        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02; //calculatig bonus percentage
            bonuses[i] = salaries[i] * bonusPercentage; // adding bonus
            newSalaries[i] = salaries[i] + bonuses[i]; // new salary

            totalBonus += bonuses[i]; 
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] +
                               ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}