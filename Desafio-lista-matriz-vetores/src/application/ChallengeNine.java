/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students will be entered?");
        int quantityOfStudents = scanner.nextInt();

        String[] name = new String[quantityOfStudents];
        double[] noteOne = new double[quantityOfStudents];
        double[] noteTwo = new double[quantityOfStudents];

        for (int i = 0; i < quantityOfStudents; i++) {
            System.out.printf("Enter name, first and second note do %do student: ", i + 1);
            scanner.nextLine();
            name[i] = scanner.nextLine();
            noteOne[i] = scanner.nextDouble();
            noteTwo[i] = scanner.nextDouble();
        }

        double average = 0;

        for (int i = 0; i < quantityOfStudents; i++) {
            average = (noteOne[i] + noteTwo[i]) / 2.0;
            if (average >= 6.0) {
                System.out.println(name[i]);
            }
        }
        scanner.close();
    }
}