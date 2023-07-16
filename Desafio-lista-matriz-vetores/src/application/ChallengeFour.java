/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero). 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeFour {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantityNumbers, higherPosition;
        double higher;

        System.out.print("How many numbers will you type? ");
        quantityNumbers = scanner.nextInt();

        double[] number = new double[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.print("Enter a number: ");
            number[i] = scanner.nextDouble();
        }

        higher = number[0];
        higherPosition = 0;

        for (int i = 0; i < quantityNumbers; i++) {
            if (number[i] > higher) {
                higher = number[i];
                higherPosition = i;
            }
        }
        System.out.printf("Highest value: %.1f\n", higher);
        System.out.printf("higher value position: %d\n", higherPosition);

        scanner.close();
    }
}
