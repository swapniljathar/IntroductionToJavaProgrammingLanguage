package Chapter_03;

import java.util.Scanner;

/**
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange
 .java, to display the nonzero denominations only, using singular words for single
 units such as 1 dollar and 1 penny, and plural words for more than one unit such
 as 2 dollars and 3 pennies.
 */
public class Exercise_07 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of dollars to convert: ");
        double money = input.nextDouble();

        double remainder = money * 100;
        double dollars = remainder / 100;
        remainder = remainder % 100;
        double quarters = remainder / 25;
        remainder = remainder % 25;
        double dimes = remainder / 10;
        remainder = remainder % 10;
        double nickels = remainder / 5;
        double cents = remainder % 5;

        System.out.println("You have $" + money + ", which is: ");
        if(dollars > 0)
            System.out.println(dollars + " dollar" + (dollars > 1 ? "s" : ""));
        if(quarters > 0)
            System.out.println(quarters + " quarter" + (quarters > 1 ? "s" : ""));
        if(dimes > 0)
            System.out.println(dimes + " dime" + (dimes > 1 ? "s" : ""));
        if(nickels > 0)
            System.out.println(nickels + " nickel" + (nickels > 1 ? "s" : ""));
        if(cents > 0)
            System.out.println(cents + " cent" + (cents > 1 ? "s" : ""));
    }
}
