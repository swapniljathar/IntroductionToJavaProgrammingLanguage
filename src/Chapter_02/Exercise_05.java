package Chapter_02;

import java.util.Scanner;

/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 and the gratuity rate, then computes the gratuity and total. For example, if the
 user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 as gratuity and $11.5 as total.
 */
public class Exercise_05 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal ($): ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate (%): ");
        double gratuityRate = input.nextDouble() / 100;

        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;

        System.out.println("Gratuity: $" + gratuity + ". Total: $" + total + ".");
    }
}
