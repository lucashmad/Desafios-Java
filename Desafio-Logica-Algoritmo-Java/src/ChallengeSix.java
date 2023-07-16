/*
    calculando uma venda com preço unitario
 */


import java.util.Locale;
import java.util.Scanner;

public class ChallengeSix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        int quantity = 0;
        double priceSold = 0, totalSold = 0;

        char answer;

        do {
            System.out.print("\nEnter the quantity of the product: ");
            quantity = string.nextInt();
            System.out.print("\nEnter the price: R$ ");
            priceSold = string.nextDouble();

            System.out.print("Do you continue? [Y/N]");
            answer = string.next().charAt(0);
        } while (answer != 'n');

        totalSold = priceSold * quantity;

        System.out.printf("Thanks, your sale was worth $ %.2f\n", totalSold);

        string.close();
    }
}
