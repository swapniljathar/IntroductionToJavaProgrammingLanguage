package Chapter_07;

/**
 *(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
 algorithm makes several passes through the array. On each pass, successive
 neighboring pairs are compared. If a pair is not in order, its values are swapped;
 otherwise, the values remain unchanged. The technique is called a bubble sort or
 sinking sort because the smaller values gradually “bubble” their way to the top
 and the larger values “sink” to the bottom. Write a test program that reads in ten
 double numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise_18 {
    public static void main (String[] args) {
        double[] myList = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        System.out.println("My list before sort is: ");

        printList(myList);
        bubbleSort(myList);

        System.out.println("My list after sort is: ");
        printList(myList);
    }

    static void printList(double[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }

    static void bubbleSort(double[] list) {
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] > list[j+1]) {
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
    }

}
