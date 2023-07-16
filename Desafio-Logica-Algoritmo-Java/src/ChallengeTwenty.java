/*
mostrando os impares na estrutura for


 */

import java.util.Scanner;

public class ChallengeTwenty {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = string.nextInt();

        for (int i = 1; i <= number; i = i + 2) {
            System.out.println(i);
        }
        string.close();
    }


}
