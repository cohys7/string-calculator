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
            return Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        }
        throw new IllegalArgumentException("Unsupported operation");
    }
}