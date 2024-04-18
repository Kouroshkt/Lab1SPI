package org.iths.consumer;

import org.iths.service.BankLoan;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        final String ANSI_GREEN = "\u001B[32;1m";
        final String ANSI_BLUE = "\u001B[34m";
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_GREEN + "Welcome to the Bank Loan Calculator!");
        System.out.println("Enter loan amount: ");
        int loanAmount = scanner.nextInt();
        System.out.println("Enter loan duration: ");
        int duration = scanner.nextInt();

        ServiceLoader<BankLoan> serviceLoader = ServiceLoader.load(BankLoan.class);
        System.out.println("Which bank do you want to borrow with?");
        for (BankLoan bankLoan : serviceLoader) {
            System.out.println((ANSI_BLUE + i + ":" + bankLoan.getBankName()));
            i++;
        }
        int bank = scanner.nextInt();

        for (BankLoan bankLoan : serviceLoader) {
            if (bank == 1 && bankLoan.getClass().getName().equals("org.iths.provider.SwedBank")) {
                bankLoan.getLoanAmount(loanAmount, duration);
                break;
            }
            if (bank == 2 && bankLoan.getClass().getName().equals("org.iths.provider.DanskBank")) {
                bankLoan.getLoanAmount(loanAmount, duration);
                break;
            }
            if (bank == 3 && bankLoan.getClass().getName().equals("org.iths.provider.Nordea")) {
                bankLoan.getLoanAmount(loanAmount, duration);
                break;
            } else if (bank == 4 && bankLoan.getClass().getName().equals("org.iths.provider.SEB")) {
                bankLoan.getLoanAmount(loanAmount, duration);
                break;
            }
        }
        ColorsMenu.continues();
    }
}
