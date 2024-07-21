package OtherProblems.Recursion.Easy;

public class CountZeros {

    public int countZeros(int n) {
        if (n == 0)
            return 1;
        if (Math.abs(n) < 10) {
            return 0;
        }

        int smallAns = countZeros(n / 10);
        if (n % 10 == 0) {
            return 1 + smallAns;
        } else {
            return smallAns;
        }

    }

    public static void main(String[] args) {

        System.out.println(new CountZeros().countZeros(100110000));
    }

}
