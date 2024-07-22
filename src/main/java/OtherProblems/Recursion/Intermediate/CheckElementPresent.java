package OtherProblems.Recursion.Intermediate;

public class CheckElementPresent {

    public boolean isElementPresent(int[] arr, int x) {
        if (arr.length == 0)
            return false;
        return checkElementRecursive(arr, x, arr.length, 0);
    }

    public boolean checkElementRecursive(int[] arr, int x, int n, int i) {
        if (i == n)
            return false;
        if (arr[i] == x)
            return true;
        return checkElementRecursive(arr, x, n, i + 1);
    }

}
