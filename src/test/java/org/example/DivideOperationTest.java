package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideOperationTest {
    @Test
    void divide_with_numbers() {
        DivideOperation divideOperation = new DivideOperation();
        assertEquals(2, divideOperation.apply(4, 2));
    }

    @Test
    void divide_with_zero() {
        DivideOperation divideOperation = new DivideOperation();
        assertThrows(IllegalArgumentException.class, () -> divideOperation.apply(1, 0));
    }
}
