package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @DisplayName("덧셈 연산을 할 수 있다.")
    @Test
    public void test1() throws IOException {
        //given
        Calculator calculator = new Calculator();
        long num1 = 3;
        String operator = "+";
        long num2 = 2;

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then

        assertThat(result).isEqualTo(5);
    }


    @DisplayName("뺄셈 연산을 할 수 있다.")
    @Test
    public void test2() throws IOException {
        //given
        Calculator calculator = new Calculator();
        long num1 = 3;
        String operator = "-";
        long num2 = 2;

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then

        assertThat(result).isEqualTo(1);
    }


    @DisplayName("나눗셈 연산을 할 수 있다.")
    @Test
    public void test3() throws IOException {
        //given
        Calculator calculator = new Calculator();
        long num1 = 4;
        String operator = "/";
        long num2 = 2;

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then

        assertThat(result).isEqualTo(2);
    }


    @DisplayName("곱셈 연산을 할 수 있다.")
    @Test
    public void test4() throws IOException {
        //given
        Calculator calculator = new Calculator();
        long num1 = 5;
        String operator = "*";
        long num2 = 2;

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then

        assertThat(result).isEqualTo(10);
    }


    @DisplayName("잘못된 연산자가 요청으로 들어올 경우 에러가 난다.")
    @Test
    public void test5() throws IOException {
        //given
        Calculator calculator = new Calculator();
        long num1 = 5;
        String operator = "x";
        long num2 = 2;

        //when
        //then
        Assertions.assertThrows(InvalidOperatorException.class, () -> calculator.calculate(num1, operator, num2));


    }

}