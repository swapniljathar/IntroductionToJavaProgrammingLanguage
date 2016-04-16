package Chapter_02;

import java.util.Scanner;

/**
 * (Financial application: compound value) Suppose you save $100 each month
 into a savings account with the annual interest rate 5%. Thus, the monthly interest
 rate is 0.05/12 = 0.00417. After the first month, the value in the account
 becomes
 100 * (1 + 0.00417) = 100.417
 After the second month, the value in the account becomes
 (100 + 100.417) * (1 + 0.00417) = 201.252
 After the third month, the value in the account becomes
 (100 + 201.252) * (1 + 0.00417) = 302.507
 and so on.
 Write a program that prompts the user to enter a monthly saving amount and
 displays the account value after the sixth month.
 */
public class Exercise_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();


        double monthlyInterestRate = annualInterestRate / 1200;

        double balance = 0;
        for (int m = 1; m <= months; m++) {
            balance = (amount + balance) * (1 + monthlyInterestRate);
        }

        System.out.printf(
                "Amount in savings account after " +
                        months + " months: $%.2f\n", balance);
    }
}
