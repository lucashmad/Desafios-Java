/*
quantos numeros estao fora da sequencia de [10,20]

utilizando a estrutura for
 */

import java.util.Scanner;

public class ChallengeTwentyOne {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("how many numbers will be reported? ");
        int number = string.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Enter a number: ");
            int nDefy = string.nextInt();

            if (nDefy >= 10 && nDefy < 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        string.close();
    }

}
