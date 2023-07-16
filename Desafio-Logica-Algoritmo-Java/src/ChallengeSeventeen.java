/*
Peguei a implementacao do programa desafio14

e a transformei em while

 */
import java.util.Locale;
import java.util.Scanner;

public class ChallengeSeventeen {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        double numberOne, numberTwo;

        System.out.print("Enter a first number: ");
        numberOne = string.nextDouble();
        System.out.print("Enter a second number: ");
        numberTwo = string.nextDouble();

        while (numberOne != 0 && numberTwo != 0) {

            if (numberOne > 0 && numberTwo > 0) {
                System.out.println("First");

            } else if (numberOne < 0 && numberTwo > 0) {
                System.out.println("Second");

            } else if (numberOne < 0 && numberTwo < 0) {
                System.out.println("Third");

            } else {
                System.out.println("Room");
            }
            System.out.print("Enter a first number: ");
            numberOne = string.nextDouble();
            System.out.print("Enter a second number: ");
            numberTwo = string.nextDouble();
        }

        string.close();
    }
}
