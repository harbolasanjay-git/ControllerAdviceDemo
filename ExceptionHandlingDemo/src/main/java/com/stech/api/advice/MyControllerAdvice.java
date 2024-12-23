package com.stech.api.advice;

import com.stech.api.EmptyInputExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(EmptyInputExceptions.class)
    public ResponseEntity<String> handleEmptyInput(EmptyInputExceptions emptyInputExceptions){
return new ResponseEntity<>("Input field is empty, Please have a look!!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException emptyInputExceptions){
        return new ResponseEntity<>("No value present for '"+emptyInputExceptions.getMessage() +"' !!", HttpStatus.NOT_FOUND);
    }
}
