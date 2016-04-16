package Chapter_04;

/**
 * (Random character) Write a program that displays a random uppercase letter
 using the Math.random() method.
 */
public class Exercise_16 {
    public static void main(String[] args) {
        int number = 65 + (int)(Math.random() * (91 - 65));
        System.out.println((char)(number));
    }
}
