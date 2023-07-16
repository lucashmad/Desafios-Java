/*
media ponderada utilizando for

 */


import java.util.Locale;
import java.util.Scanner;

public class ChallengeTwentyTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        System.out.print("how many times it will be repeated? ");
        int number = string.nextInt();

        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double nResult = 0;


        System.out.println("Enter numbers: ");
        for (int i = 1; i <= number; i++) {
            number1 = string.nextDouble();
            number2 = string.nextDouble();
            number3 = string.nextDouble();

            nResult = (number1 * 2 + number2 * 3 + number3 * 5) / 10;

            System.out.printf("%.1f", nResult);
            System.out.println();
        }

        string.close();
    }
}
