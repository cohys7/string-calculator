package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @ParameterizedTest
    @DisplayName("사칙 연산을 수행할 수 있다.")
    @CsvSource({
            "1+2, 3",
            "3-2, 1",
            "4*2, 8",
            "6/2, 3"
    })
    void calculate(String expression, Integer expected) {
        // given 주어진 상황을 (상황)
        StringCalculator calculator = new StringCalculator();

        // when 실행 하면 (행동)
        // then 결과가 이렇게 된다. (검증)
        assertEquals(expected, calculator.calculate(expression));
    }

    @Test
    @DisplayName("0으로 나눌 때 IllegalArgumentException을 던진다.")
    void divide_with_zero() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate("1/0"));
    }

    @ParameterizedTest
    @DisplayName("숫자 대신 문자가 들어올 때 IllegalArgumentException을 던진다.")
    @ValueSource(strings = {
            "a-0",
            "0+b",
            "1*c",
            "d/2"
    })
    void invalid_number(String expression) {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(expression));
    }
}