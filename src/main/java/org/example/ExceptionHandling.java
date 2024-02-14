package org.example;

public class ExceptionHandling {

    public static double divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend < 0 || divisor < 0) {
            throw new RuntimeException("Negative numbers are not allowed");
        }
        return (double) dividend / divisor;
    }

}
