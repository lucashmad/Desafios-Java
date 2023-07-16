/*
diferença entre os numeros

 */


import java.util.Scanner;

public class ChallengeFour {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int numberTree;
        int numberFour;
        int numberDif;

        System.out.print("\nEnter the First number: ");
        numberOne = string.nextInt();
        System.out.print("\nEnter the Second number: ");
        numberTwo = string.nextInt();
        System.out.print("\nEnter the Third number: ");
        numberTree = string.nextInt();
        System.out.print("\nEnter the Room number: ");
        numberFour = string.nextInt();

        numberDif = (numberOne * numberTwo - numberTree * numberFour);

        System.out.println("Difference = " + numberDif);

        string.close();
    }

}
