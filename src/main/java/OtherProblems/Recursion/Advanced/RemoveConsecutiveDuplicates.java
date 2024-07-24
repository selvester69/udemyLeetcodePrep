package OtherProblems.Recursion.Advanced;

public class RemoveConsecutiveDuplicates {

    public String removeDuplicates(char[] arr) {
        if (arr.length == 0)
            return "";
        if (arr.length == 1)
            return new String(arr);
        StringBuilder sb = new StringBuilder();
        // useRecursion(arr, arr.length, 0, sb);
        useOptimizeRecursion(arr, arr.length, 0, sb);
        return sb.toString();
    }

    public void useRecursion(char[] arr, int n, int i, StringBuilder sb) {

        // base case
        if (i == n - 1) {
            sb.append(arr[i]);
            return;
        }

        // recursive case
        if (arr[i] == arr[i + 1]) {
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            useRecursion(arr, n, i, sb);
        } else {
            sb.append(arr[i]);
            useRecursion(arr, n, i + 1, sb);
        }

    }

    public void useOptimizeRecursion(char[] arr, int n, int i, StringBuilder sb) {

        // base case
        if (i == n - 1) {
            sb.append(arr[i]);
            return;
        }
        // recursive case
        if (arr[i] != arr[i + 1]) {
            sb.append(arr[i]);
        }
        useRecursion(arr, n, i + 1, sb);

    }

}
