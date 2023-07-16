/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeTree {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people typing? ");
        int quantityNumbers = scanner.nextInt();

        String[] name = new String[quantityNumbers];
        int[] age = new int[quantityNumbers];
        double[] height = new double[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.printf("\nDate of %do person\n", i + 1);
            System.out.print("Name: ");
            name[i] = scanner.next();
            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            System.out.print("Height: ");
            height[i] = scanner.nextDouble();
        }

        int quantityMinors = 0;
        double totalHeight = 0;

        for (int i = 0; i < quantityNumbers; i++) {
            if (age[i] < 16) {
                quantityMinors++;
            }
            totalHeight = totalHeight + height[i];
        }

        double averageHeight = totalHeight / quantityNumbers;
        double percentageMinors = ((double) quantityMinors / quantityNumbers) * 100.0;

        System.out.printf("\nAverage height: %.2f\n", averageHeight);
        System.out.printf("People under 16 years old: %.1f%%\n ", percentageMinors);

        for (int i = 0; i < quantityNumbers; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }
    }
}
