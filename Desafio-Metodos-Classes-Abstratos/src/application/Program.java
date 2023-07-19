/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
 */
package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int repeatOne = scanner.nextInt();

        for (int i = 1; i <= repeatOne; i++) {
            System.out.print("Individual or company (i/c)? ");
            char response = scanner.next().charAt(0);
            System.out.println("Tax payer #" + i + " data: ");
            if (response == 'i'){
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                double continuance = scanner.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                taxPayers.add(new Individual(name, continuance, healthExpenditures));
            } else {
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                double continuance = scanner.nextDouble();
                System.out.print("Number of Employees: ");
                int numberOfEmployees = scanner.nextInt();
                taxPayers.add(new Company(name, continuance, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tax : taxPayers){
            double taxTotal = tax.tax();
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
            sum += taxTotal;
        }

        System.out.println(String.format("Total Taxes: $ %.2f", sum));

        scanner.close();
    }
}
