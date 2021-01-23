package com.hackerearth.cafeteriaapp.exception;

import com.hackerearth.cafeteriaapp.model.CafeteriaException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CafeteriaExceptionHandler {
    @ExceptionHandler
    public Exception getDefaultException(Exception exception) {
        return exception;
    }

    @ExceptionHandler(CafeteriaException.class)
    public CafeteriaException getCafeteriaException(CafeteriaException cafeteriaException) {
        return cafeteriaException;
    }
}
