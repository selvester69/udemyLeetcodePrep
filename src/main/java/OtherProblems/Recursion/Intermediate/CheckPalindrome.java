package OtherProblems.Recursion.Intermediate;

public class CheckPalindrome {

    public boolean isPalindrome(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return true;
        return isResursive(arr, 0, arr.length - 1);
    }

    public boolean isResursive(int[] arr, int start, int end) {
        if (start > end)
            return true;

        if (arr[start] == arr[end]) {
            return isResursive(arr, start + 1, end - 1);
        }
        return false;
    }

}
