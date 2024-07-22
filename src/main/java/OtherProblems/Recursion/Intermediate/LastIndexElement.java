package OtherProblems.Recursion.Intermediate;

public class LastIndexElement {

    public int findLastIndex(int[] arr, int x) {
        if (arr.length == 0)
            return -1;
        return lastIndexRecursive(arr, x, arr.length, arr.length - 1);

    }

    public int lastIndexRecursive(int[] arr, int x, int n, int i) {
        if (i == -1)
            return -1;
        if (arr[i] == x)
            return i;

        return lastIndexRecursive(arr, x, n, i - 1);

    }

}
