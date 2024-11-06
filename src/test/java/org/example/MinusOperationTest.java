package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinusOperationTest {
    @Test
    void minus_left_and_right() {
        MinusOperation minusOperation = new MinusOperation();
        assertEquals(1, minusOperation.apply(2, 1));
    }
}
