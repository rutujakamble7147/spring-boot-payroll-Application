package com.rutuja.spring.boot.payroll.application;


import com.rutuja.spring.boot.payroll.application.CustomException.EmployeeNotFoundAdvice;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

@Slf4j
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.rutuja")
@SpringBootApplication
public class PayrollApplication {


	public static void main(String... args) {

		SpringApplication.run(PayrollApplication.class, args);
		log.info("Payroll Application started...");

	}

}