package OtherProblems.Sorting;

public class QuickSort {

    public void quickSort(int arr[]) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int p = partition(arr, start, end);
        sort(arr, start, p - 1);
        sort(arr, p + 1, end);
    }

    public int partition(int arr[], int start, int end) {
        int count = 0;
        int pivot = arr[end];
        for (int i = start; i <= end - 1; i++) {
            if (arr[i] <= pivot)
                count++;
        }
        int pivotIndex = start + count;
        arr[end] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        int i = start, j = end;
        while (i < j) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }

}
