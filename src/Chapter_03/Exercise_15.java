package Chapter_03;

import java.util.Scanner;

/**
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
 number. The program prompts the user to enter a three-digit number and
 determines whether the user wins according to the following rules:
 1. If the user input matches the lottery number in the exact order, the award is
 $10,000.
 2. If all digits in the user input match all digits in the lottery number, the award is
 $3,000.
 3. If one digit in the user input matches a digit in the lottery number, the award is
 $1,000.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);
        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int remainingDigits = lottery % 100;
        int lotteryDigit2 = remainingDigits / 10;
        int lotteryDigit3 = remainingDigits % 10;


        int guessDigit1 = guess / 100;
        remainingDigits = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        int guessDigit3 = remainingDigits % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        if (guessDigit1 == lotteryDigit2)
        {

        }
    }
}
