package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorRequestReaderTest {

    @DisplayName("Systemin으로 데이터를 읽어들 일 수 있다. ")
    @Test
    void read() {
        System.setIn(new ByteArrayInputStream("1 + 2".getBytes()));
        CalculatorRequestReader calculatorRequestReader = new CalculatorRequestReader();
        CalculationRequest result = calculatorRequestReader.read();
        assertEquals(1, result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(2, result.getNum2());

    }
}