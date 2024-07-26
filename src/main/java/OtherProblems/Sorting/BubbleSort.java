package OtherProblems.Sorting;

import Util.Util;

/**
 * different ways we can write for loop
 * 1st way
 * i===> 0--> n-1
 * j===> 0--> n-i-1
 * ==================
 * 2nd way
 * i===> 1--> =n-1
 * j===> 0--> =n-2
 * ==================
 * import point to remember j repeats n-2 times
 */
public class BubbleSort {

    public void bubbleSort(int arr[]) {
        Util.printSingleLine(arr);
        if (arr.length == 0 || arr.length == 1)
            return;
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Util.swap(arr, j, j + 1);
                }
            }
        }
        System.out.println();
        Util.printSingleLine(arr);
    }

    public void bubbleSortOptimized(int arr[]) {
        Util.printSingleLine(arr);
        if (arr.length == 0 || arr.length == 1)
            return;
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Util.swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println();
        Util.printSingleLine(arr);
    }

    public static void main(String[] args) {
        new BubbleSort().bubbleSort(new int[] { 3, 2, 1, 3, 5, 7 });
    }

}
