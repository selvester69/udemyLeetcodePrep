package OtherProblems.Sorting;

import Util.Util;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallindex]) {
                    smallindex = j;
                }
            }
            if (arr[smallindex] < arr[i]) {
                Util.swap(arr, i, smallindex);
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(new int[] { 5, 4, 3, 2, 1 });
    }

}
