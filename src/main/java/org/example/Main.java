package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            int result = (int) ExceptionHandling.divideNumbers(10, 2);
            System.out.println("Result: " + result);
            int result2 = (int) ExceptionHandling.divideNumbers(10, 0);
            System.out.println("Result: " + result2);
            int result3 = (int) ExceptionHandling.divideNumbers(10, -2);
            System.out.println("Result: " + result3);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
