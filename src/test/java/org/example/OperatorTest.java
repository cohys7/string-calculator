package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {
    @ParameterizedTest
    @CsvSource({
            "1+2, ADD",
            "3-2, MINUS",
            "4*2, MULTIPLY",
            "6/2, DIVIDE"
    })
    void find_operator(String expression, Operator expected) {
        Operator operator = Operator.find(expression);
        assertEquals(operator, expected);
    }
}
