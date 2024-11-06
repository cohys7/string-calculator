package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {
    @Test
    void add_left_and_right() {
        AddOperation addOperation = new AddOperation();
        assertEquals(3, addOperation.apply(1, 2));
    }
}
