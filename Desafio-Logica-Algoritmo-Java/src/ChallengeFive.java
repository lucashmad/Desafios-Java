/*
   calculando o salario de um funcionario a partir das horas trabalhadas

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeFive {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string =  new Scanner(System.in);

        int id = 0, hours = 0;
        double salary = 0;

        System.out.print("How many employees to type?");
        int repOne = string.nextInt();


        for (int i = 1; i <= repOne; i++) {
            System.out.print("\nEnter the employee ID: ");
            id = string.nextInt();

            System.out.print("\nEmployee hours worked: ");
            hours = string.nextInt();

            System.out.print("\nThe Employee's Salary: U$ ");
            salary = string.nextDouble();

        }

        if (hours <= 18) {
            salary *= hours;
        }

        System.out.println("\nNUMBER: " + id);
        System.out.printf("SALARY U$ %.2f ", salary);

        string.close();
    }
}
