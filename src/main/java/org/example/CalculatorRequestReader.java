package org.example;

import java.util.Scanner;

public class CalculatorRequestReader {
    public CalculationRequest read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and operator (e.g 1 + 2): ");
        String result = sc.nextLine();
        String[] parts = result.split(" ");
        return new CalculationRequest(parts);
    }
}
