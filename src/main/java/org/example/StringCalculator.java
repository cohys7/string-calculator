package org.example;

public class StringCalculator {
    public int calculate(String expression) {
        Operator operator = Operator.find(expression);
        String[] numbers = expression.split("\\" + operator.getSymbol());
        int left = parseNumber(numbers[0]);
        int right = parseNumber(numbers[1]);
        return operator.applyOperation(left, right);
    }

    private Integer parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number");
        }
    }
}