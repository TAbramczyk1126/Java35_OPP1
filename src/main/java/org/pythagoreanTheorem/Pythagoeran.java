package org.pythagoreanTheorem;

public class Pythagoeran {

    public static boolean rectangularTriangle(double a, double b, double c) {
        if (c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
            return true;
        } else {
            return false;
        }
    }
}
