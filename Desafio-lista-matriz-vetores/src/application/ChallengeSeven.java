package application;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeSeven {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantityNumbers, sumPairs = 0, pairs = 0;
        double mediaPairs;

        System.out.print("How many elements will there be in the vector? ");
        quantityNumbers = scanner.nextInt();

        int[] vectorNumbers = new int[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.print("enter a number: ");
            vectorNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < quantityNumbers; i++) {
            if (vectorNumbers[i] % 2 == 0) {
                sumPairs += vectorNumbers[i];
                pairs++;
            }
        }

        if (pairs == 0) {
            System.out.println("Didn't have a pair! ");
        } else {
            mediaPairs = (double) sumPairs / pairs;

            System.out.printf("Peer average: %.1f", mediaPairs);
        }
        scanner.close();
    }
}