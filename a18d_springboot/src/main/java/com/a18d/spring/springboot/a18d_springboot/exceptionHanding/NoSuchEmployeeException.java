package com.a18d.spring.springboot.a18d_springboot.exceptionHanding;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
