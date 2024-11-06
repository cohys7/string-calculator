package org.example;

public class AddOperation implements Operation {
    @Override
    public int apply(int left, int right) {
        return left + right;
    }
}
