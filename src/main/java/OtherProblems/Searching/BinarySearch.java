package OtherProblems.Searching;

/**
 * mid = (start+end)/2 can cause integer overflow as well as underflow
 * if start and end are big then over flow may happend and it can change the
 * value to -ve with the wrapper.
 * therefore we use s+(end-start)/2
 * above cannot happen because we are subtracting.
 */

public class BinarySearch {

    public int binarySearch(int[] arr, int key) {
        if (arr.length == 0)
            return -1;

        // int index = recursiveSearch(arr, 0, arr.length - 1, key);
        int index = iterativeSearch(arr, key);

        return index;
    }

    public int recursiveSearch(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return recursiveSearch(arr, 0, mid - 1, key);
        } else {
            return recursiveSearch(arr, mid + 1, end, key);
        }
    }

    public int iterativeSearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;// this can cause overflow
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
