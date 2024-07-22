package OtherProblems.Recursion.Intermediate;

public class CountOccurrence {

    public int countOccurrences(int[] arr, int x) {
        if (arr.length == 0)
            return 0;

        return countRecursive(arr, x, arr.length, 0);
    }

    public int countRecursive(int[] arr, int x, int n, int i) {
        if (i == n)
            return 0;
        if (arr[i] == x)
            return 1 + countRecursive(arr, x, n, i + 1);
        return countRecursive(arr, x, n, i + 1);

    }

}
