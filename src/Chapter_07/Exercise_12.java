package Chapter_07;

/**
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by
 copying it to a new array. Rewrite the method that reverses the array passed in
 the argument and returns this array. Write a test program that prompts the user to
 enter ten numbers, invokes the method to reverse the numbers, and displays the
 numbers.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(myList);

        for (int i = 0; i < myList.length; i++)
            System.out.print(myList[i] + " ");
    }

    public static int[] reverse(int[] list) {
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}
