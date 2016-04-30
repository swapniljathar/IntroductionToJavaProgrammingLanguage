package Chapter_06;

import java.util.Scanner;

/**
 * (Count the letters in a string) Write a method that counts the number of letters in
 a string using the following header:
 public static int countLetters(String s)
 Write a test program that prompts the user to enter a string and displays the number
 of letters in the string.
 */
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println(
                "The number of letters in the string \"" +
                        string + "\": " + countLetters(string));
    }

    public static int countLetters(String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++;
        }
        return numberOfLetters;
    }
}

