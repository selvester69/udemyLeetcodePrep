package OtherProblems.Recursion.Advanced;

/**
 * countways is called 3 time because 3 jumps are allowed 1,2,3
 * if 2 jumps allowed then we will recur N-1 and N-2 etc.
 */

public class StairCaseProblem {

    public int countways(int N) {
        if (N < 0)
            return 0;
        if (N == 0)
            return 1;

        return countways(N - 1) + countways(N - 2) + countways(N - 3);

    }

    public static void main(String[] args) {
        System.out.println(new StairCaseProblem().countways(5));
    }

}
