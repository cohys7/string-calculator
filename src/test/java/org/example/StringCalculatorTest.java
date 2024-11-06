package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    @DisplayName("사칙 연산을 수행할 수 있다.")
    void calculate() {
        // given 주어진 상황을 (상황)
        StringCalculator calculator = new StringCalculator();

        // when 실행 하면 (행동)
        // then 결과가 이렇게 된다. (검증)
        assertEquals(3, calculator.calculate("1+2"));
        assertEquals(1, calculator.calculate("3-2"));
        assertEquals(8, calculator.calculate("4*2"));
        assertEquals(3, calculator.calculate("6/2"));
    }

    @Test
    @DisplayName("0으로 나눌 때 IllegalArgumentException을 던진다.")
    void divide_with_zero() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate("1/0"));
    }
}