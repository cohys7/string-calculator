package org.example;

public class MultipleOperation implements Operation {
    @Override
    public int apply(int left, int right) {
        return left * right;
    }
}
