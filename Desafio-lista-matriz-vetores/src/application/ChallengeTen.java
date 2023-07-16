/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeTen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int amountOfIncrement, amountOfWomen, amountOfMen;
        double mediumHeightFemale, fullFemaleHeight;

        System.out.print("How many people typing? ");
        amountOfIncrement = scanner.nextInt();

        char[] sex = new char[amountOfIncrement];
        double[] height = new double[amountOfIncrement];

        for (int i = 0; i < amountOfIncrement; i++) {
            System.out.printf("Height of %da person:", i + 1);
            height[i] = scanner.nextDouble();
            System.out.println();
            System.out.printf("Gender of %da person:", i + 1);
            sex[i] = scanner.next().charAt(0);
        }

        double shorterHeight = height[0];
        double greaterHeight = height[0];

        for (int i = 0; i < amountOfIncrement; i++) {
            if (height[i] > greaterHeight) {
                greaterHeight = height[i];
            }
            if (height[i] < shorterHeight)
                shorterHeight = height[i];
        }

        amountOfWomen = 0;
        amountOfMen = 0;
        fullFemaleHeight = 0;
        for (int i = 0; i < amountOfIncrement; i++) {
            if (sex[i] == 'M') {
                amountOfMen++;
            } else {
                amountOfWomen++;
                fullFemaleHeight += height[i];
            }
        }

        mediumHeightFemale = fullFemaleHeight / amountOfWomen;
        System.out.printf("Shortest height: %.2f%n", shorterHeight);
        System.out.printf("Greater height: %.2f%n", greaterHeight);
        System.out.printf("Average height of women: %.2f%n", mediumHeightFemale);
        System.out.printf("Number of men = %d", amountOfMen);

        scanner.close();
    }
}
