package org.example;

public class CalculationRequest {

    private final long num1;
    private final String operator;
    private final long num2;

    public CalculationRequest(String[] parts) {
        if (parts.length != 3) {
            throw new BadRequestException();
        }
        operator = parts[1];
        if (operator.length() != 1 || isInvalidOperation(operator)) {
            throw new InvalidOperatorException();
        }
        this.num1 = Long.parseLong(parts[0]);
        this.num2 = Long.parseLong(parts[2]);
    }

    private static boolean isInvalidOperation(String operator) {
        return !operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/");
    }

    public long getNum1() {
        return num1;
    }

    public String getOperator() {
        return operator;
    }

    public long getNum2() {
        return num2;
    }
}
