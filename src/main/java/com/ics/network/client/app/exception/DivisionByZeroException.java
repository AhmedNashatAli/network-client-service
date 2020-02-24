package com.ics.network.client.app.exception;

public class DivisionByZeroException extends RuntimeException {

    private static final long serialVersionUID = 7492932001565224708L;

    public DivisionByZeroException(final String message) {
        super(message);
    }

}