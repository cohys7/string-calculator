package org.example;

import org.junit.jupiter.api.Test;
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

    @Test
    void apply_add_operation() {
        // given
        int left = 5;
        int right = 3;
        Operator operator = Operator.ADD;

        // when
        int result = operator.applyOperation(left, right);

        // then
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void apply_minus_operation() {
        // given
        int left = 5;
        int right = 3;
        Operator operator = Operator.MINUS;

        // when
        int result = operator.applyOperation(left, right);

        // then
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    void apply_multiply_operation() {
        // given
        int left = 5;
        int right = 3;
        Operator operator = Operator.MULTIPLY;

        // when
        int result = operator.applyOperation(left, right);

        // then
        assertEquals(15, result, "5 * 3 should equal 15");
    }

    @Test
    void apply_divide_operation() {
        // given
        int left = 6;
        int right = 3;
        Operator operator = Operator.DIVIDE;

        // when
        int result = operator.applyOperation(left, right);

        // then
        assertEquals(2, result, "6 / 3 should equal 2");
    }
}
