package Chapter_02;

import java.util.Scanner;

/**
 * (Financial application: calculate future investment value) Write a program that
 reads in investment amount, annual interest rate, and number of years, and displays
 the future investment value using the following formula:
 futureInvestmentValue =
 investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 For example, if you enter amount 1000, annual interest rate 3.25%, and number
 of years 1, the future investment value is 1032.98.
 */
public class Exercise_21 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.println("Enter annual interest rate in %: ");
        float monthlyInterestRate = input.nextFloat() / 1200;
        System.out.println("Enter number of years: ");
        byte years = input.nextByte();

        double futureValue = investment * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.println("Your investment will be " + futureValue);
    }
}
