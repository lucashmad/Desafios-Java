/*
fazer um programa que armazene em uma list

o funcionario com a id, pra aumentar o salario do determinado escolhido
 */
package application;

import data.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ChallengeList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee:  #%d", i + 1);
            System.out.println();
            System.out.print("Id: ");
            Integer ID = scanner.nextInt();

            while (hasID(employeeList, ID)) {
                System.out.println("The given id already exists, try again: ");
                ID = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee emp = new Employee(name, ID, salary);

            employeeList.add(emp);
        }

        System.out.print("Enter the employee id: ");
        int idSalary = scanner.nextInt();
        Integer positionId = position(employeeList, idSalary);

        if (positionId == null) {
            System.out.println("This id does not exist! ");
        } else {
            System.out.print("enter the percentage increase: ");
            double percentageSalary = scanner.nextDouble();
            employeeList.get(positionId).increaseSalary(percentageSalary);
        }

        System.out.println();
        System.out.println("list of employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        scanner.close();
    }

    // funcao pra encontrar o id
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    // funcao pra retornar true or false
    public static boolean hasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}