package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleOperationTest {
    @Test
    void multiple_left_and_right() {
        MultipleOperation multipleOperation = new MultipleOperation();
        assertEquals(6, multipleOperation.apply(2, 3));
    }
}
