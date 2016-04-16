package Chapter_04;

import java.util.Scanner;

/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 0 and 15 and displays its corresponding hex number.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 0 && decimal <= 9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        else
            System.out.println(decimal + " is an invalid input");
    }
}
