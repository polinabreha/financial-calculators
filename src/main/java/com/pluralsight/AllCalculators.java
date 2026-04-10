package com.pluralsight;

import java.util.Scanner;

public class AllCalculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose what calculator you want to use today:\n" +
                "1. Mortgage calculator\n" +
                "2. Future value calculator\n" +
                "3. Present value calculator\n" +
                "Enter you choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            mortgageCalculator(input);
        }else if(choice == 2){
            futureValueCalculator(input);
        }else if(choice == 3){
            presentValueCalculator(input);
        }else{
            System.out.println("Invalid choice");
        }

    }

    public static void mortgageCalculator(Scanner scanner){
        System.out.print("How much is the total amount of the loan? ");
        double total = scanner.nextDouble(); //P

        System.out.print("Can you write please the nominal annual interest rate in decimal form?(e.g. 7.625% = 0.07625) ");
        double annualInterestRate = scanner.nextDouble(); //r

        System.out.print("How many years the loan lasts? ");
        int years = scanner.nextInt(); //y

        int numberOfMonthlyPayments = 12 * years; //n

        double monthlyInterestRate =  annualInterestRate / 12; //i

        double a = Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments);

        double mortgage = total * ((monthlyInterestRate * a ) / (a -1));
        double totalInterest = (mortgage * numberOfMonthlyPayments) - total;

        System.out.printf("The mortgage is $%.2f/mo%n" , mortgage);
        System.out.printf("Total Interest is $%,.2f%n", totalInterest);


    }

    public static void futureValueCalculator(Scanner scanner){
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
    public static void presentValueCalculator(Scanner scanner){
        System.out.print("What's your monthly payout amount? ");
        double monthlyPayout = scanner.nextDouble(); //M

        System.out.print("Can you please tell me what's your annual interest rate in decimal form?" +
                "(e.g., 1.75% = 0.0175) ");
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
