package Chapter_02;

import java.util.Scanner;

/**
 * (Find the number of years) Write a program that prompts the user to enter the
 minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 For simplicity, assume a year has 365 days.
 */
public class Exercise_07 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes to convert: ");
        long minutes = input.nextLong();

        long totalDays = minutes / (60 * 24);
        int days = (int) totalDays % 365;
        int years = (int) totalDays / 365;
        System.out.println(minutes + " minutes is approximately " + years
                + " years and " + days + " days");
    }
}
