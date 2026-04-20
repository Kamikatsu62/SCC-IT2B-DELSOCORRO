import java.util.Scanner;

public class salaries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Employee: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Store employee details
        Employee[] employees = new Employee[numEmployees];

        // Get details for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details of emp" + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Rate (Hourly): ");
            double hourlyRate = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Hours worked: ");
            int hoursWorked = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Deduction: ");
            double deduction = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Create an Employee object and store it
            employees[i] = new Employee(id, name, hourlyRate, hoursWorked, deduction);
        }

        // Calculate and display total salary, deductions, and net pay
        double totalSalary = 0;
        double totalDeductions = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
            totalDeductions += employee.getDeduction();
        }

        System.out.println("\nTotal Salary: " + totalSalary);
        System.out.println("Total Employee Deductions: " + totalDeductions);
        System.out.println("Total Net Pay: " + (totalSalary - totalDeductions));
        System.out.println("No. of Employees: " + numEmployees);

        scanner.close();
    }
}

class Employee {
    private String id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    private double deduction;

    public Employee(String id, String name, double hourlyRate, int hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.deduction = deduction;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double getDeduction() {
        return deduction;
    }
}