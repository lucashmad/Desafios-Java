/*
desafio1 como destaque a saida de dados

 */

import java.util.Locale;

public class ChallengeOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String sProduct1 = "Computer";
        String sProduct2 = "Office desktop";

        int age = 30;
        int code = 5290;
        char gender = 'F'; // para char, aspas simples

        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, with the value of R$ %.4f Real%n", sProduct1, priceOne);
        System.out.printf("%s, with the value of R$ %.2f Real%n", sProduct2, priceTwo);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %s ", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f", measure);
        System.out.println();
        System.out.printf("Rouded (tree decimal places): %.3f%n", measure);


        System.out.printf("US decimal point: %.3f ", measure);

    }
}
