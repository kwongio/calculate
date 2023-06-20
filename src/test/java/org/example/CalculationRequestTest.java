package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculationRequestTest {

    @Test
    @DisplayName("유효한 숫자를 파싱할 수 있다.")
    public void test1() {
        //given
        String[] parts = "1 + 2".split(" ");
        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);


        //then
        assertThat(calculationRequest.getNum1()).isEqualTo(1);
        assertThat(calculationRequest.getOperator()).isEqualTo("+");
        assertThat(calculationRequest.getNum2()).isEqualTo(2);

    }


    @Test
    @DisplayName("세자리 숫자가 넘어가는 유효한 숫자를 파싱할 수 있다.")
    public void test2() {
        //given
        String[] parts = "2323 + 3333".split(" ");

        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        //then
        assertThat(calculationRequest.getNum1()).isEqualTo(2323);
        assertThat(calculationRequest.getOperator()).isEqualTo("+");
        assertThat(calculationRequest.getNum2()).isEqualTo(3333);

    }

    @Test
    @DisplayName("유효한 길이의 숫자가 들어오지 않으면 에러를 반환한다.")
    public void test3() {
        //given
        String[] parts = "2323 +".split(" ");

        //when

        //then
        assertThrows(BadRequestException.class, () -> new CalculationRequest(parts));

    }


    @Test
    @DisplayName("유효하지 않은 연산자가 들어오면  에러를 반환한다.")
    public void test4() {
        //given
        String[] parts = "2323 x 333".split(" ");

        //when

        //then
        assertThrows(InvalidOperatorException.class, () -> new CalculationRequest(parts));

    }


    @Test
    @DisplayName("유효하지 않은 길이의 연산자가 들어오면  에러를 반환한다.")
    public void test5() {
        //given
        String[] parts = "2323 +- 333".split(" ");

        //when

        //then
        assertThrows(InvalidOperatorException.class, () -> new CalculationRequest(parts));

    }

}