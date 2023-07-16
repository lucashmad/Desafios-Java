/*

Denominador nao divisivel por 0

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeTwentyTree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        System.out.println("how many times it will be repeated? ");
        int numberOne = string.nextInt();


        for (int i = 0; i < numberOne; i++) {
            double number = string.nextInt();
            double dividend = string.nextInt();

            if (dividend == 0) {
                System.out.println("Impossible division");
            } else {
                double division = number / dividend;
                System.out.printf("%.1f", division);
            }
        }

        string.close();
    }
}
