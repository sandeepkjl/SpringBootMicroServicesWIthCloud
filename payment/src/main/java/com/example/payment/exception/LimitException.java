package com.example.payment.exception;

public class LimitException extends RuntimeException {
    public LimitException(String msg) {
        super(msg);
    }
}
