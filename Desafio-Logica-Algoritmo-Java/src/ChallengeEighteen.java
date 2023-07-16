/*
    preferencia de produtos em um posto de combustivel

 */


import java.util.Scanner;

public class ChallengeEighteen {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        int aLcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        System.out.println("Alcohol: #1");
        System.out.println("Gasoline: #2");
        System.out.println("Diesel: #3");
        System.out.println("Exit: #4");

        int type = string.nextInt();

        while (type != 4) {

            if (type == 1) {
                aLcohol = aLcohol + 1;
            } else if (type == 2) {
                gasoline = gasoline + 1;
            } else if (type == 3) {
                diesel = diesel + 1;
            }
            type = string.nextInt();
        }
        System.out.println("Thank You!");
        System.out.println("Alcohol: " + aLcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        string.close();
    }

}
