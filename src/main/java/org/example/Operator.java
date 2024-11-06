package org.example;

public enum Operator {
    ADD("+", new AddOperation()),
    MINUS("-", new MinusOperation()),
    MULTIPLY("*", new MultipleOperation()),
    DIVIDE("/", new DivideOperation());

    private final String symbol;
    private final Operation operation;

    Operator(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
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

    public int applyOperation(int left, int right) {
        return operation.apply(left, right);
    }
}

