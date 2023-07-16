/*
    fatorial de numeros

 */


import java.util.Scanner;

public class ChallengeTwentyFour {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the number for the calculation: ");
        int number = string.nextInt();

        int numberFactor = 1;

        for (int i = 1; i <= number; i++) {
            numberFactor *= i;
        }
        System.out.println("Result: " + numberFactor);

        string.close();
    }
}
