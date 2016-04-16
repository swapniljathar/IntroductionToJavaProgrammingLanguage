package Chapter_04;

import java.util.Scanner;

/**
 *(Process a string) Write a program that prompts the user to enter a string and displays
 its length and its first character.
 */
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sting: ");
        String str = input.nextLine();

        System.out.println(str + " has a length of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}
