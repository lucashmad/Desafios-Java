/*
   vetores com numeros negativos


 */


package application;

import java.util.Scanner;

public class ChallengerOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers to type? ");
        int quantityNumbers = scanner.nextInt();

        int[] vectorNumbers = new int[quantityNumbers];

        for (int i = 0; i < vectorNumbers.length; i++) {
         System.out.print("Enter a number: ");
         vectorNumbers[i] = scanner.nextInt();

        }

        for (int i = 0; i < vectorNumbers.length; i++) {
            if(vectorNumbers[i] < 0){
                System.out.printf("%d\n", vectorNumbers[i]);
            }
        }

        scanner.close();
    }


}
