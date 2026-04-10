package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your initial deposit amount ");
        double initialDeposit = scanner.nextDouble(); //P

        System.out.print("What is your nominal annual interest rate in decimal form?\n" +
                "(e.g., 1.75% = 0.0175) ");
        double annualInterestRate = scanner.nextDouble(); //r

        System.out.print("Can you write the total number of years the deposit will earn interest? ");
        int numberOfYears = scanner.nextInt(); //t

        int numbersOfDaysInYear = 365;

        double totalNumbersOfDays = numbersOfDaysInYear * numberOfYears;

        double a = 1 + (annualInterestRate/ 365);

        double futureValue = initialDeposit *   Math.pow(a,totalNumbersOfDays);

        double totalInterest = futureValue - initialDeposit;

        System.out.printf("The future value is $%.2f%n" , futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n" , totalInterest);







    }
}
