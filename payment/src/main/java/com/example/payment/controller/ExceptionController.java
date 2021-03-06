package com.example.payment.controller;

import com.example.payment.exception.LimitException;
import com.example.payment.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(LimitException.class)
    public ExceptionResponse throwLimitException(WebRequest webRequest){
        return new
                ExceptionResponse(1,"Limit Excption",webRequest.getDescription(true), HttpStatus.BAD_REQUEST);

    }

}
