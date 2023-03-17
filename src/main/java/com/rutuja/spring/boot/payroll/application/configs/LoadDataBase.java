package com.rutuja.spring.boot.payroll.application.configs;

import com.rutuja.spring.boot.payroll.application.model.Employee;
import com.rutuja.spring.boot.payroll.application.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);
    @Bean
    @Qualifier("cmdLineRunner")
    CommandLineRunner initDatabase (EmployeeRepository repository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
              log.info("preloading"+repository.save(new Employee("SE","rutuja","kamble")));
              log.info("preloading"+repository.save(new Employee("ST","anjali","jadhav")));


            }
        };
    }
}