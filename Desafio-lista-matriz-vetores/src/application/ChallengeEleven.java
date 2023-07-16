/*
fazer um programa de ospedaria e guardar no vetor

o nome da pessoa, quarto escolhido e o email

em seguida mostrar na tela, apenas os cadastrados
 */
package application;

import data.Roms;

import java.util.Scanner;

public class ChallengeEleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms to register? ");
        int quantityRoms = scanner.nextInt();


        Roms[] vectorRoom = new Roms[10];

        for (int i = 1; i <= quantityRoms; i++) {
            System.out.printf("Rent %d: %n ", i + 1);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Roms: ");
            int Rom = scanner.nextInt();

            vectorRoom[Rom] = new Roms(name, email);
        }

        for (int i = 0; i < 10; i++) {
            if (vectorRoom[i] != null) {
                System.out.println(i + ": " + vectorRoom[i]);
            }
        }
        scanner.close();
    }
}