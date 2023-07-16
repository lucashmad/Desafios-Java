/*

utilizando a estrutura for, mostrando o numero de linhas

e calculando o numero em quadrado e do cubo do valor.

 */

import java.util.Scanner;

public class ChallengeTwentySix {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = string.nextInt();

        System.out.print("\nResult:\n ");
        for (int i = 1; i <= number; i++) {

            int first = i;
            int second = i * i;
            int third = i * i * i;
            System.out.printf("%d %d %d", first, second, third);

        }
        string.close();
    }

}

