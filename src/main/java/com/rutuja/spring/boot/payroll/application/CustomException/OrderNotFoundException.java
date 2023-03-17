package com.rutuja.spring.boot.payroll.application.CustomException;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}