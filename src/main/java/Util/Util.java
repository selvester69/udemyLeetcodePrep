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

    public static void main(String[] args) {
        Util.print(new int[] { 1, 2, 3, 4, 5 });
    }

}
