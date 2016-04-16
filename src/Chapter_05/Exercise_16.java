package Chapter_05;

/**
 *(Find the factors of an integer) Write a program that reads an integer and displays
 all its smallest factors in increasing order. For example, if the input integer is
 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
public class Exercise_16 {
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.println("The factors for " + number + " is");
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                number = number / factor;
                System.out.println(factor);
            }
            else {
                factor++;
            }
        }
}
        }
