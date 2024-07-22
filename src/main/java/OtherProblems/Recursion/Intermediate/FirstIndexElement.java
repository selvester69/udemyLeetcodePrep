package OtherProblems.Recursion.Intermediate;

public class FirstIndexElement {

    public int findFirstIndex(int[] arr, int x) {
        if (arr.length == 0)
            return -1;
        return firstIndexRecursive(arr, x, arr.length, 0);
    }

    public int firstIndexRecursive(int[] arr, int x, int n, int i) {
        if (i == n)
            return -1;
        if (arr[i] == x)
            return i;
        return firstIndexRecursive(arr, x, n, i + 1);
    }
}
