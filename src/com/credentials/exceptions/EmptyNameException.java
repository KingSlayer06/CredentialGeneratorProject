package com.credentials.exceptions;

public class EmptyNameException extends RuntimeException{

    public EmptyNameException() {
        super();
    }

    public EmptyNameException(String message) {
        super(message);
    }


}
