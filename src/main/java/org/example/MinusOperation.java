package org.example;

public class MinusOperation implements Operation {
    @Override
    public int apply(int left, int right) {
        return left - right;
    }
}