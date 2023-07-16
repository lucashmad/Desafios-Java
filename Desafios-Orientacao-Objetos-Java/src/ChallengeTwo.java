import Application.Employee;

import java.util.Locale;
import java.util.Scanner;

public final class ChallengeTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();


        System.out.println("Tax: ");
        employee.rate = scanner.nextDouble();

        System.out.print("Employee: " + employee);

        System.out.println();
        System.out.print("What percentage increase ");
        double percentage = scanner.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.printf("Update Salary: " + employee);

        scanner.close();
    }


}
