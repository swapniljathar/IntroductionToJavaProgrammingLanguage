package Chapter_03;

import java.util.Scanner;

/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 which represents head or tail. The program prompts the user to enter a guess and
 reports whether the guess is correct or incorrect.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();

        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");
    }
}
