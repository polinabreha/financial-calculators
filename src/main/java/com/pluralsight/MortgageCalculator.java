package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("How much is the total amount of the loan? ");
        double total = input.nextDouble(); //P

        System.out.print("Can you write please the nominal annual interest rate in decimal form?(e.g. 7.625% = 0.07625) ");
        double annualInterestRate = input.nextDouble(); //r

        System.out.print("How many years the loan lasts? ");
        int years = input.nextInt(); //y

        int numberOfMonthlyPayments = 12 * years; //n

        double monthlyInterestRate =  annualInterestRate / 12; //i

        double a = Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments);

        double mortage = total * ((monthlyInterestRate * a ) / (a -1));

        System.out.printf("The mortgage is $%.2f/mo%n" , mortage);









    }
}
