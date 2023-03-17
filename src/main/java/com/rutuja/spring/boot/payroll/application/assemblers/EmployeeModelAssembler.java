package com.rutuja.spring.boot.payroll.application.assemblers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


import com.rutuja.spring.boot.payroll.application.Controllers.EmployeeController;
import com.rutuja.spring.boot.payroll.application.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employeeModelAssembler")
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return EntityModel.of(employee, //
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("all_employees"));
    }
}