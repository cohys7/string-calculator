package org.example;

public class DivideOperation implements Operation {
    @Override
    public int apply(int left, int right) {
        if (right == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }
        return left / right;
    }
}
