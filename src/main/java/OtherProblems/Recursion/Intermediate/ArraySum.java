package OtherProblems.Recursion.Intermediate;

public class ArraySum {

    public int sumArray(int[] arr) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        return isSumRecursive(arr, arr.length, 0);
    }

    public int isSumRecursive(int arr[], int n, int i) {
        if (i == n)
            return 0;

        return arr[i] + isSumRecursive(arr, n, i + 1);

    }

}
