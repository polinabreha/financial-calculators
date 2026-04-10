package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your monthly payout amount? ");
        double monthlyPayout = scanner.nextDouble(); //M

        System.out.print("Can you please tell me what's your annual interest rate in decimal form? ");
        double annualInterestRate = scanner.nextDouble(); //r

        double monthlyInterestRate = annualInterestRate / 12; //i

        System.out.print("How many years would you like to receive monthly payouts?(e.g. 20) ");
        int years = scanner.nextInt(); //y

        int totalNumberOfPayments = years * 12; // n

        double a = Math.pow(1 + monthlyInterestRate, -totalNumberOfPayments);

        double presentValue = monthlyPayout * (1-a) / monthlyInterestRate;

        System.out.printf("The present value of an ordinary annuity is $%,.2f/today%n", presentValue);

    }
}
