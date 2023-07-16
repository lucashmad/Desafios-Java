/*
    plano cartesiano

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeFourteen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        double numberOne, numberTwo;

        System.out.print("Enter a first number: ");
        numberOne = string.nextDouble();
        System.out.print("Enter a second number: ");
        numberTwo = string.nextDouble();

        if (numberOne == 0 && numberTwo == 0) {
            System.out.println("origin");

        } else if (numberOne > 0 && numberTwo > 0) {
            System.out.println("Q1");

        } else if (numberOne < 0 && numberTwo > 0) {
            System.out.println("Q2");

        } else if (numberOne < 0 && numberTwo < 0) {
            System.out.println("Q3");

        } else {
            System.out.println("Q4");
        }

        string.close();
    }
}

