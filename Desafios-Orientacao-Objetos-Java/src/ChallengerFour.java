/*
cotacao do dolar em reais
 */

import Util.dollarShare;
import java.util.Locale;
import java.util.Scanner;

public final class ChallengerFour {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        char response;
        do {
            System.out.print("Enter the dollar amount: ");
            double dollarPrice = scanner.nextDouble();

            System.out.println("How many dollars to buy? ");
            double amount = scanner.nextDouble();

            double dollarResult = dollarShare.dollarAtReal(amount, dollarPrice);

            System.out.printf("dollar converted to real: R$ %.2f%n", dollarResult);

            System.out.print("\nWant to continue shopping? [Y/N]");
            response = scanner.next().charAt(0);
        } while (response != 'n');

        scanner.close();
    }


}
