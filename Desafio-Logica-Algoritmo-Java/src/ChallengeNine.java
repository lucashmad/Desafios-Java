/*
desafio do par ou impar
 */

import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = string.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAIR");
        } else {
            System.out.println("ODD");
        }

        string.close();
    }
}
