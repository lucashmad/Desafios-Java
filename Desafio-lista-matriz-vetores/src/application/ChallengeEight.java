/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */
package application;

import java.util.Scanner;

public class ChallengeEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int amountOfPeople = scanner.nextInt();

        String[] name = new String[amountOfPeople];
        int[] age = new int[amountOfPeople];


        for (int i = 0; i < amountOfPeople; i++) {
            System.out.printf("\nData from %da person:\n", i + 1);
            System.out.print("Name: ");
            name[i] = scanner.next();
            System.out.print("Age: ");
            age[i] = scanner.nextInt();
        }

        int olderAge = age[0];
        int higherPosition = 0;

        for (int i = 0; i < amountOfPeople; i++) {
            if (age[i] > olderAge) {
                olderAge = age[i];
                higherPosition = i;
            }
        }
        System.out.printf("Older person: %s\n", name[higherPosition]);

        scanner.close();
    }
}
