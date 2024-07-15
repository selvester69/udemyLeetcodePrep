package main.test.UtilTest;

import org.junit.jupiter.api.Test;

import main.java.Util.Util;

public class Testutil {

    Util util = new Util();

    @Test
    public void testPrint() {
        Util.print(new int[] { 1, 2, 3, 4, 5 });
    }
}
