package OtherProblems.Recursion.Advanced;

public class FindAllPermutations {

    public void permute(char[] str, int i) {

        if (i == str.length) {
            System.out.println(new String(str));
            return;
        }
        for (int j = i; j < str.length; j++) {
            swap(str, i, j);
            permute(str, i + 1);
            swap(str, i, j);
        }

    }

    public void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        new FindAllPermutations().permute("ABC".toCharArray(), 0);
    }

}
