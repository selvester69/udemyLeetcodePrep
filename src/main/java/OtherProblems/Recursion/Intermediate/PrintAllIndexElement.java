package OtherProblems.Recursion.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class PrintAllIndexElement {

    public List<Integer> findAllPositions(int[] arr, int x) {
        List<Integer> position = new ArrayList<>();
        findAllIndexRecursive(arr, x, arr.length, 0, position);
        return position;
    }

    public void findAllIndexRecursive(int[] arr, int x, int n, int i, List<Integer> position) {
        if (i == n)
            return;
        if (arr[i] == x)
            position.add(i);
        findAllIndexRecursive(arr, x, n, i + 1, position);
    }

}
