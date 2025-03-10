package model.application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Inicial Balance: ");
        double inicialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withDrawLimit = sc.nextDouble();
        Account c = new Account(number, holder, inicialBalance, withDrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            c.withDraw(amount);

            System.out.println(c);
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}
