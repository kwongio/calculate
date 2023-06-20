package org.example;

public class BadRequestException extends RuntimeException {

    private final static String MESSAGE = "Invalid input size, you must input 3 length";

    public BadRequestException() {
        super(MESSAGE);
    }
}
