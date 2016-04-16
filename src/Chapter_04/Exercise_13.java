package Chapter_04;

import java.util.Scanner;

/**
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 check whether the letter is a vowel or consonant.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (Character.isLetter(ch))
        {
            switch(Character.toUpperCase(ch))
            {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U': System.out.println(ch + " is a vowel"); break;
                default : System.out.println(ch + " is a consonant");
            }
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}
