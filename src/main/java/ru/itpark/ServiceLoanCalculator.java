package ru.itpark;

public class ServiceLoanCalculator {
    public int calculateDeposit(int creditAmount, double interestRate , int termCredit) {
        int monthInYaer = 12;
        int hunredPercent = 100;
        int numericValue = 1;
        double monthlyInterestRate = (interestRate /monthInYaer) / hunredPercent;
        double intermediateValue = Math.pow((numericValue + monthlyInterestRate),termCredit);
        double annuityRatio = (monthlyInterestRate*intermediateValue)/(intermediateValue - numericValue);
        double monthlyPayment = annuityRatio * creditAmount;
        int totalLoan = (int) monthlyPayment * termCredit;
        return totalLoan;
    }
}
