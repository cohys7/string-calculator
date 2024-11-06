package org.example;

public enum Operator {
    ADD("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator find(String expression) {
        for (Operator operator : values()) {
            if (expression.contains(operator.symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unsupported operation");
    }

    public String getSymbol() {
        return symbol;
    }


}
