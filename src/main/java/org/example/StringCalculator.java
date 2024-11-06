package org.example;

public class StringCalculator {
    public int calculate(String expression) {
        if (expression.contains("+")) {
            String[] numbers = expression.split("\\+");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (expression.contains("-")) {
            String[] numbers = expression.split("-");
            return Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (expression.contains("*")) {
            String[] numbers = expression.split("\\*");
            return Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        } else if (expression.contains("/")) {
            String[] numbers = expression.split("/");
            if (numbers[1].equals("0")) {
                throw new IllegalArgumentException("Divide by zero");
            }
            return Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        }
        throw new IllegalArgumentException("Unsupported operation");
    }
}