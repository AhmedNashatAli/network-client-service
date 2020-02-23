package com.ics.network.client.app.exception;

import com.ics.network.client.app.exception.response.CustomErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@RestControllerAdvice
public class RestDefaultExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomErrorResponse handleNoHandlerFound(final NoHandlerFoundException e, final WebRequest request) {
        final CustomErrorResponse errors = new CustomErrorResponse(HttpStatus.NOT_FOUND, e.getLocalizedMessage());
        return errors;
    }


    @ExceptionHandler(Throwable.class)
    public CustomErrorResponse handleDefaultException(final Throwable ex) {
        final CustomErrorResponse errors = new CustomErrorResponse(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage());
        return errors;
    }

}