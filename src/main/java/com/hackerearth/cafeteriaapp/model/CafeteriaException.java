package com.hackerearth.cafeteriaapp.model;

import org.springframework.http.HttpStatus;

public class CafeteriaException extends RuntimeException {
    private HttpStatus status;

    public CafeteriaException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
