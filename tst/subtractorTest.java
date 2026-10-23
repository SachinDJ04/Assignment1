package tst;

import src.subtractor;

public class subtractorTest {
    public static void main(String[] args) {
        subtractor s = new subtractor();
        System.out.println(s.subtract(5, 3) == 2 ? "PASS" : "FAIL");
    }
}
