/*
    quanto paga de imposto de renda
    por uma pessoa por salario

 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengerFifteen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the person's salary: ");
        double salary = string.nextDouble();

        if (salary <= 2000.0) {
            System.out.println("Income tax amount: immune");
        } else if (salary <= 3000.0) {
            System.out.printf("Income tax amount: R$ %.2f", (salary - 2000.0) * 0.08);
        } else if (salary <= 4500.0) {
            System.out.printf("Income tax amount: R$ %.2f", 1000.0 * 0.08 + (salary - 3000.0) * 0.18);
        } else {
            System.out.printf("Income tax amount: R$ %.2f", 1000.0 * 0.08 + 1500.0 * 0.18 + (salary - 4500.0) * 0.28);
        }

        string.close();
    }
}
