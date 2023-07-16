/*
utilizando a estrutura while

exercicio de digitar uma senha e repetir ate que o acesso seja liberado

 */

import java.util.Scanner;

public class ChallengeSixteen {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Password: ");
        int password = 2002;

        password = string.nextInt();

        while (password != 2002) {
            System.out.println("Password invalid!");

            password = string.nextInt();
        }

        System.out.println("Access allowed");

        string.close();
    }
}
