package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<= taxPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c) ?: ");
            char c = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if (c == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (c == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer p : list) {
            System.out.println(p);
        }

        double totalTaxes = 0;
        for (TaxPayer p : list) {
            totalTaxes += p.tax();
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));


        sc.close();
    }
}
