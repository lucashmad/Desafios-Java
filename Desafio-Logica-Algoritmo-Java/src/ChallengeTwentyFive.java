/*
informando o divisor para a divisao dos numeros

utilizando a estrutura for
 */

import java.util.Scanner;

public class ChallengeTwentyFive {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the number for splitter: ");
        int number = string.nextInt();

        System.out.println("Result: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        string.close();
    }

}
