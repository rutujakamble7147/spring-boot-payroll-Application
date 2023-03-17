package com.rutuja.spring.boot.payroll.application.CustomException;

public class EmployeeNotFoundException extends RuntimeException {

   public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}