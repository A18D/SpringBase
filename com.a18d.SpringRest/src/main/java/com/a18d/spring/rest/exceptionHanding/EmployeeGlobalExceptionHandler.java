package com.a18d.spring.rest.exceptionHanding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeenorectData> handleException(
            NoSuchEmployeeException exception
    ){
        EmployeenorectData data = new EmployeenorectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<EmployeenorectData>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeenorectData> handleException(
            Exception exception
    ){
        EmployeenorectData data = new EmployeenorectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
