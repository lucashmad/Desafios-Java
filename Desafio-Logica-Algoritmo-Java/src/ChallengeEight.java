/*
identificando se um numero e positivo ou negativo
 */

import java.util.Scanner;

public class ChallengeEight {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = string.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        string.close();
    }
}
