package Chapter_05;

/**
 * (Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest
 integer n such that n2 is greater than 12,000.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        int i = 1;
        while (i * i <= 12000 ) {
            i++;
        }
        System.out.println("This number is " + i);
    }
}
