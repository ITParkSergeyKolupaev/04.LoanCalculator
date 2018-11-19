package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceLoanCalculatorTest {

    @Test
    void calculateDeposit() {
        ServiceLoanCalculator serviceLoanCalculator = new ServiceLoanCalculator();
        double calculateDeposit = serviceLoanCalculator.calculateDeposit(600_000, 14.9, 60);
        assertEquals(854_520, calculateDeposit);

    }
}