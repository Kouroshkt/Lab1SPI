package org.iths.provider;

import org.iths.service.BankLoan;

import java.time.LocalDate;

public class SwedBank implements BankLoan {
    LocalDate date = LocalDate.now();

    @Override
    public void getLoanAmount(int loanAmount, int duration) {
        double installment = Calculator.installmentAmount(loanAmount, duration, 0.05);
        if(installment == 0) {
            System.out.println("Invalid input");
        }else {
            System.out.println("Sewed Bank will give you a loan with installments of " + installment + " Kronor in  " + duration + " months. Today's date: " + date + "\n");
        }
    }

    @Override
    public String getBankName() {
        return "Swedbank";
    }
}
