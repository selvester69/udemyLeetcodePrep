package OtherProblems.Recursion.Intermediate;

public class CheckSortedArray {

    public boolean isArraySorted(int arr[]) {
        // edge case
        if (arr.length == 0 || arr.length == 1)
            return true;
        return isSorted(arr, arr.length, 1);
    }

    public boolean isSorted(int arr[], int n, int i) {
        // base case
        if (i == n)
            return true;
        // recursive case
        if (arr[i - 1] < arr[i])
            return isSorted(arr, n, i + 1);
        else
            return false;
    }

}
