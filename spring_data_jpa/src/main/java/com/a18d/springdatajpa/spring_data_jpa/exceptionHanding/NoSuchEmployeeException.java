package com.a18d.springdatajpa.spring_data_jpa.exceptionHanding;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
