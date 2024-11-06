package org.example;

public class StringCalculator {
    public int calculate(String expression) {
        if (expression.contains("+")) {
            String[] numbers = expression.split("\\+");
            return parseNumber(numbers[0]) + parseNumber(numbers[1]);
        }
        if (expression.contains("-")) {
            String[] numbers = expression.split("-");
            return parseNumber(numbers[0]) - parseNumber(numbers[1]);
        }
        if (expression.contains("*")) {
            String[] numbers = expression.split("\\*");
            return parseNumber(numbers[0]) * parseNumber(numbers[1]);
        }
        if (expression.contains("/")) {
            String[] numbers = expression.split("/");
            if (numbers[1].equals("0")) {
                throw new IllegalArgumentException("Divide by zero");
            }
            return parseNumber(numbers[0]) / parseNumber(numbers[1]);
        }
        throw new IllegalArgumentException("Unsupported operation");
    }

    private Integer parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number");
        }
    }
}