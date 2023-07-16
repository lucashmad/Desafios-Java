/*
    multiplos
 */

import java.util.Scanner;

public class ChallengeTen {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = string.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = string.nextInt();

        if (number1 % 2 == 0 && number2 % 2 == 0) { // posso mudar a % por qualquer resto de divisao
            System.out.println("Multiple");
        } else {
            System.out.println("Are not multiples");
        }
        string.close();
    }
}
