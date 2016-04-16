package Chapter_04;

import java.util.Scanner;

/**
 * (Days of a month) Write a program that prompts the user to enter a year and the
 first three letters of a month name (with the first letter in uppercase) and displays
 the number of days in the month.
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        boolean leapYear =
                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.print(month + " " + year + " has ");

        if ( month.equals("Jan") || month.equals("Mar") ||
                month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec"))
            System.out.println(31 + " days");
        else if (month.equals("Apr") || month.equals("Jun") ||
                month.equals("Sep") || month.equals("Nov"))
            System.out.println(30 + " days");
        else
            System.out.println(((leapYear) ? 29 : 28) + " days");
    }
}
