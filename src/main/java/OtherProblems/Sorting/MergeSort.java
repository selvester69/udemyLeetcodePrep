package OtherProblems.Sorting;

import Util.Util;

public class MergeSort {

    public void mergeSort(int[] arr) {
        Util.printSingleLine(arr);
        sortRecursive(arr, 0, arr.length - 1);
        Util.printSingleLine(arr);
    }

    public void sortRecursive(int[] arr, int start, int end) {
        // base case
        if (start >= end)
            return;

        int mid = (start + end) / 2;
        int[] x = new int[50];
        int y[] = new int[50];
        for (int i = 0; i <= mid; i++) {
            x[i] = arr[i];
        }
        for (int i = mid + 1; i <= end; i++) {
            y[i] = arr[i];
        }
        sortRecursive(x, start, mid);
        sortRecursive(y, mid + 1, end);
        merge(x, y, arr, start, end);
    }

    public void merge(int[] x, int[] y, int[] arr, int start, int end) {
        int mid = (start + end) / 2;

        int i = start, j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (x[i] < y[j]) {
                arr[k] = x[i];
                i++;
                k++;
            } else {
                arr[k] = y[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            arr[k] = x[i];
            k++;
            i++;
        }
        while (j <= end) {
            arr[k] = y[j];
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        new MergeSort().mergeSort(new int[] { 5, 4, 10, 2, 1 });
    }

}
