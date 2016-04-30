package Chapter_07;

/**
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 The selection-sort method repeatedly finds the smallest number in the current
 array and swaps it with the first. Rewrite this program by finding the largest number
 and swapping it with the last. Write a test program that reads in ten double
 numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise_20 {

    public static void main(String[] args) {
        double[] myList = new double[10];

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        selectionSort(myList);

        System.out.println();
        System.out.println("My list after sort is: ");
        printList(myList);
    }

    static void printList(double[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + "  ");
        System.out.println();
    }

    static void selectionSort(double[] list) {
        double currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
