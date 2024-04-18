package org.iths.provider;

public class Calculator {
    public static double installmentAmount(int loanAmount, int duration, double interestRate) {
        if (loanAmount <= 0 || duration <= 0 || interestRate <= 0) {
            System.out.println("Loan amount, duration and interest rate must be positive");
            return 0;
        } else {
            double installmentAmount = loanAmount * interestRate * Math.pow(1 + interestRate, duration) / (Math.pow(1 + interestRate, duration) - 1);
            installmentAmount = Math.round(installmentAmount * 100) / 100.0;
            return installmentAmount;
        }
    }
}
