package com.rest.codecli.exception;

public class UserAccountNotFoundException extends RuntimeException{
    public UserAccountNotFoundException(String message) {
        super(message);
    }
}
