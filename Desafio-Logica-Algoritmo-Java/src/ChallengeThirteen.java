/*
fora do intervalo ou dentro do intervalo

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeThirteen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = string.nextDouble();

        if (number < 0 || number > 100) {
            System.out.println("Out of Range");

        } else if (number <= 25) {
            System.out.println("Interval: [0,25]");

        } else if (number <= 50) {
            System.out.println("Interval: [25,50]");

        } else if (number <= 75) {
            System.out.println("Interval: [50,75]");

        } else {
            System.out.println("Interval: [75,100]");
        }

        string.close();
    }
}
