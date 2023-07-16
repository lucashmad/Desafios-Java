/*
um programa que le uma conta bancaria

pergunta se o usuario quer depositar uma quantia na conta

se nao mostra apenas a conta do usuario com o nome

utilizando Orientação orientada a objetos

 */


import Application.Account;

import java.util.Locale;
import java.util.Scanner;

public class ChallengerFive {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Account Account;

        System.out.println("Enter account number: ");
        int number = scanner.nextInt();
        System.out.println("Account username:");
        scanner.nextLine();
        String Holder = scanner.nextLine();

        System.out.println("Enter the deposit amount? ");
        char resp = scanner.next().charAt(0);

        if(resp == 'y'){
            System.out.println("Enter initial value deposit value: ");
            double initialDeposity = scanner.nextDouble();
            Account = new Account(number, Holder, initialDeposity);

        }
        else {
            Account = new Account(number, Holder);
        }

        System.out.println();
        System.out.print("Account data: ");
        System.out.println(Account);

        System.out.println();
        System.out.print("Enter com o deposit value: $ ");
        double depositValue = scanner.nextDouble();
        Account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.print(Account);

        System.out.println();
        System.out.print("Enter a withdraw value: $");
        double withdrawValue = scanner.nextDouble();
        Account.cashWhitDrawal(withdrawValue);
        System.out.print("Update account data: ");
        System.out.println(Account);

        scanner.close();

    }

}
