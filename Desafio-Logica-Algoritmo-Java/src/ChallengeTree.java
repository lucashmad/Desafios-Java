/*
calculando a circunferencia de um circulo

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeTree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        double radianPi = 3.14159;
        double ray; // circunferencia
        double totalArea;

        System.out.print("Enter the radius value: ");
        ray = string.nextDouble();

        totalArea = radianPi * ray * ray;

        System.out.printf("Area = %.4f ", totalArea);

        string.close();
    }
}
