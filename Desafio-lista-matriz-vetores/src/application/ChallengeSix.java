/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeSix {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double sum, average;

        System.out.print("How many elements will the vector have? ");
        int quantityNumbers = scanner.nextInt();

        double[] vectorNumbers = new double[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.println("Enter a number: ");
            vectorNumbers[i] = scanner.nextDouble();
        }

        sum = 0;
        for (int i = 0; i < quantityNumbers; i++) {
            sum += vectorNumbers[i];
        }

        average = sum / quantityNumbers;

        System.out.printf("Vector average = %.3f%n", average);
        System.out.println("Below average elements: ");

        for (int i = 0; i < quantityNumbers; i++) {
            if (vectorNumbers[i] < average) {
                System.out.printf("%.1f%n", vectorNumbers[i]);
            }
        }
        scanner.close();
    }
}
