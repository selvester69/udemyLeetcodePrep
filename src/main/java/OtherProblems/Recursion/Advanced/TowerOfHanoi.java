package OtherProblems.Recursion.Advanced;

public class TowerOfHanoi {

    public int countSteps(int n) {// n represents number of disks present.
        if (n <= 0) {
            return 0;
        }
        return countSteps(n - 1) + 1 + countSteps(n - 1);
    }

    public void printSteps(int n, char source, char destination, char helper) {
        if (n == 0)
            return;
        printSteps(n - 1, source, helper, destination);
        System.out.println("Moving disk " + n + " from " + source + " to " + destination);
        printSteps(n - 1, helper, destination, source);

    }

    public static void main(String[] args) {
        TowerOfHanoi obj = new TowerOfHanoi();
        System.out.println(obj.countSteps(3));
        obj.printSteps(3, 'A', 'C', 'B');
    }

}
