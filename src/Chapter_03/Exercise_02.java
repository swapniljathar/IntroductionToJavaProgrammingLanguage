package Chapter_03;

import java.util.Scanner;

/**
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 two integers and prompts the user to enter the sum of these two integers.
 Revise the program to generate three single-digit integers and prompt the user to
 enter the sum of these three integers.
 */
public class Exercise_02 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int sum = digit1 + digit2 + digit3;

        System.out.println("What is " + digit1 + " + " + digit2 + " + " + digit3 + "?");
        if(input.nextInt() == sum)
            System.out.println("You're right! The answer is " + sum);
        else
            System.out.println("Sorry, the answer is " + sum);
    }
}
