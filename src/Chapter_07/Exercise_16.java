package Chapter_07;

/**
 * (Execution time) Write a program that randomly generates an array of 100,000
 integers and a key. Estimate the execution time of invoking the linearSearch
 method in Listing 7.6. Sort the array and estimate the execution time of invoking
 the binarySearch method in Listing 7.7. You can use the following code
 template to obtain the execution time:
 long startTime = System.currentTimeMillis();
 perform the task;
 long endTime = System.currentTimeMillis();
 long executionTime = endTime - startTime;
 */
public class Exercise_16 {
    public static void main(String[] args) {
        int num;
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandomInt();
        }
        int key = getRandomInt();


        int searchResult;
        long startTime = System.currentTimeMillis();
        searchResult = linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

        selectionSort(numbers);

        startTime = System.currentTimeMillis();
        searchResult = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime + " ");
    }

    public static int getRandomInt() {
        return 1 + (int) (Math.random() * 100000);
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < mid)
                high = mid - 1;
            else if (key == mid)
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}