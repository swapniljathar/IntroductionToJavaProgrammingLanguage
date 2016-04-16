package Chapter_04;

import java.util.Scanner;

/**
 * (Convert letter grade to number) Write a program that prompts the user to enter a
 letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 1, or 0.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'F' && ch != 'E')
        {
            System.out.print("The numeric value for grade " + ch + " is ");
            switch(ch)
            {
                case 'A': System.out.println(4); break;
                case 'B': System.out.println(3); break;
                case 'C': System.out.println(2); break;
                case 'D': System.out.println(1); break;
                case 'F': System.out.println(0);
            }
        }
        else
            System.out.println(ch + " is an invalid grade");
    }

}
