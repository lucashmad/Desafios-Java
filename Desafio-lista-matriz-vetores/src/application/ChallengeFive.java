/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.

 */


package application;

import java.util.Scanner;

public class ChallengeFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityNumbers;

        System.out.print("How many values will there be in each vector? ");
        quantityNumbers = scanner.nextInt();

        int[] vectorA = new int[quantityNumbers];
        int[] vectorB = new int[quantityNumbers];
        int[] vectorC = new int[quantityNumbers];

        System.out.println("Enter the values of vector A: ");

        for (int i = 0; i < quantityNumbers; i++) {
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Enter the values of vector B: ");

        for (int i = 0; i < quantityNumbers; i++) {
            vectorB[i] = scanner.nextInt();
        }

        System.out.println("Resulting value: ");
        for (int i = 0; i < quantityNumbers; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Resulting value: ");

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.printf("%d\n", vectorC[i]);
        }
        scanner.close();
    }
}
