/*
fazer um programa pra ler uma matriz, e mostrar em seguida

em qual posicao se encontra o numero dentro da matriz.
 */

package application;

import java.util.Scanner;

public class MatrixChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.print("Enter a first number: ");
        numberOne = scanner.nextInt();
        System.out.println("Enter a second number: ");
        numberTwo = scanner.nextInt();

        int[][] mat = new int[numberOne][numberTwo];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();

            }
        }
        int numberPosition = scanner.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numberPosition) {
                    System.out.println("Position: " + i + ", " + j + ": ");
                }
                if (j > 0) {
                    System.out.println("Left: " + mat[i][j - 1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i - 1][j]);
                }
                if (j < mat[i].length - 1) {
                    System.out.println("Right: " + mat[i][j + 1]);
                }
                if (i < mat.length - 1) {
                    System.out.println("Down: " + mat[i + 1][j]);
                }
            }
        }
        scanner.close();
    }
}