/*
    alterações no programa do desafio 18

    utilizando switch case como opção do if

 */

import java.util.Scanner;

public class ChallengeNineteen {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        System.out.println("Alcohol: #1");
        System.out.println("Gasoline: #2");
        System.out.println("Diesel: #3");
        System.out.println("Exit: #4");

        int type = vs.nextInt();

        while (type != 4) {
            switch (type) {
                case 1:
                    alcohol += 1;
                    break;

                case 2:
                    gasoline += 1;
                    break;

                case 3:
                    diesel += 1;
                    break;
            }
            type = vs.nextInt();
        }

        System.out.println("Thank you! ");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        vs.close();
    }
}
