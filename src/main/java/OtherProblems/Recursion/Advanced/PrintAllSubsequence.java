package OtherProblems.Recursion.Advanced;

public class PrintAllSubsequence {

    public String printAll(String s) {
        String sb = new String();
        recursive(s, sb);
        return sb.toString();
    }

    public void recursive(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op.toString());
            return;
        }

        recursive(ip.substring(1), op);
        recursive(ip.substring(1), op + ip.charAt(0));

    }

    public static void main(String[] args) {
        new PrintAllSubsequence().printAll("abc");
    }

}
