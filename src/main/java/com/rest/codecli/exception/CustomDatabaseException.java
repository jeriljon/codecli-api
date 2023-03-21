package com.rest.codecli.exception;

public class CustomDatabaseException extends RuntimeException{
    public CustomDatabaseException(String message) {
        super(message);
    }
}
