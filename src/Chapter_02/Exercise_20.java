package Chapter_02;

import java.util.Scanner;

/**
 *(Financial application: calculate interest) If you know the balance and the annual
  percentage interest rate, you can compute the interest on the next monthly payment
 using the following formula:
 interest = balance * (annualInterestRate/1200)
 Write a program that reads the balance and the annual percentage interest rate and
 displays the interest for the next month.
 */
public class Exercise_20 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your balance: ");
        double balance = input.nextDouble();
        System.out.println("Enter the annual interest rate (%): ");
        float annualInterestRate = input.nextFloat();

        double interest = balance * (annualInterestRate / 1200);

        System.out.println("Interest for next month: " + interest);
    }
}
