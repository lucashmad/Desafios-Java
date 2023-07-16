/*
Um programa que leia a quantidade de numeros double, armazene no vetor

e em seguida, tirar sua somatoria e media

 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int quantityNumbers = scanner.nextInt();

        double [] vectorNumbers = new double[quantityNumbers];

        for (int i = 0; i < vectorNumbers.length; i++) {
            System.out.println();
            System.out.println("Enter a number:");
            vectorNumbers[i] = scanner.nextDouble();
        }

        System.out.print("Values: ");

        double sum = 0.0;
        for (int i = 0; i < vectorNumbers.length; i++) {
               System.out.printf("%.1f:  ", vectorNumbers[i]);
                sum += vectorNumbers[i];
        }

        double average = sum / quantityNumbers;

        System.out.printf("\nSum = %.2f\n", sum);
        System.out.printf("average = %.2f", average);

        scanner.close();
    }
}

