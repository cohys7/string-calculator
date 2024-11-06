package org.example;

public class StringCalculator {
    public int calculate(String expression) {
        if (expression.contains("+")) {
            String[] numbers = expression.split("\\+");
            int left = parseNumber(numbers[0]);
            int right = parseNumber(numbers[1]);
            return new AddOperation().apply(left, right);
        }
        if (expression.contains("-")) {
            String[] numbers = expression.split("-");
            int left = parseNumber(numbers[0]);
            int right = parseNumber(numbers[1]);
            return new MinusOperation().apply(left, right);
        }
        if (expression.contains("*")) {
            String[] numbers = expression.split("\\*");
            int left = parseNumber(numbers[0]);
            int right = parseNumber(numbers[1]);
            return new MultipleOperation().apply(left, right);
        }
        if (expression.contains("/")) {
            String[] numbers = expression.split("/");
            int left = parseNumber(numbers[0]);
            int right = parseNumber(numbers[1]);
            return new DivideOperation().apply(left, right);
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