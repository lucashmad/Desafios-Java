/*
calculando a soma de dois numeros
e mostrando seu resultado

 */

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        int numberOne, numberTwo, totalSum;

        char answer = ' ';

        System.out.print("Want to get started? [y/n]  ");
        answer = string.next().charAt(0);

        while (answer != 'n') {

            System.out.print("\nEnter the first number: ");
            numberOne = string.nextInt();

            System.out.print("\nEnter the second number: ");
            numberTwo = string.nextInt();

            totalSum = numberOne + numberTwo;

            System.out.println("SUM = " + totalSum);

            System.out.println("Do you be continue? [y/n]");
            answer = string.next().charAt(0);
        }
        string.close();
    }
}
