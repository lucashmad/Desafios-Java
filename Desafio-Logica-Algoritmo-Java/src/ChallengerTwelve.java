/*
programa de vendas de uma lanchonete

escolhendo o codigo do produto, pra efetuar a venda
 */


import java.util.Locale;
import java.util.Scanner;

public class ChallengerTwelve {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        double finalPrice = 0;
        int quantity, idProduct;

        System.out.println("Code #1 = Hot Dog");
        System.out.println("Code #2 = Burger");
        System.out.println("Code #3 = pizza");
        System.out.println("Code #4 = juice");
        System.out.println("Code #5 = soft drink");

        System.out.print("Enter the code: ");
        idProduct = string.nextInt();
        System.out.print("Enter the quantity sold: ");
        quantity = string.nextInt();

        switch (idProduct) {
            case 1:
                finalPrice = 4.00 * quantity;
                break;
            case 2:
                finalPrice = 4.50 * quantity;
                break;
            case 3:
                finalPrice = 5.00 * quantity;
                break;
            case 4:
                finalPrice = 2.00 * quantity;
                break;
            case 5:
                finalPrice = 1.50 * quantity;
                break;
            default:
                break;
        }

        System.out.printf("\nTotal sale: R$ %.2f\n", finalPrice);

        string.close();
    }
}
