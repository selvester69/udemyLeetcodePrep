package main.java.Util;

import java.util.Arrays;

public class Util {

    public void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
    }

    public static void print(int[] arr) {
        Arrays.stream(arr).forEach(val -> System.out.println(val));
    }

    public static String getMinString(String[] str) {
        int index = 0;
        int minLength = Integer.MAX_VALUE;
        if (str.length == 0)
            return "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < minLength) {
                minLength = str[i].length();
                index = i;
            }
        }
        return str[index];

    }

    public static int calculate(int op1, int op2, char op) {
        int res = 0;
        switch (op) {
            case '+':
                res = op1 + op2;
                break;
            case '-':
                res = Math.abs(op1 - op2);
                break;
            case '*':
                res = op1 * op2;
                break;
            case '/':
                res = op1 / op2;
                break;
            default:
                break;
        }
        return res;

    }

    public static char[] fillArrayWithAlphabet() {
        char[] arr = new char[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Util.print(new int[] { 1, 2, 3, 4, 5 });
    }

}
