package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculationRequest calculationRequest = new CalculatorRequestReader().read();
        Calculator calculator = new Calculator();
        long answer = calculator.calculate(calculationRequest.getNum1(), calculationRequest.getOperator(), calculationRequest.getNum2());
        System.out.println(answer);
    }
}