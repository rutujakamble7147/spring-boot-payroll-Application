package com.rutuja.spring.boot.payroll.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Employee {
  private @Id
    @GeneratedValue Long id;
  private String role;
  private String name;
  private String firstName;
  private String lastname;

    public Employee( String role, String firstName, String lastName) {

        this.role = role;
        this.firstName = firstName;
      this.lastname = lastName;
    }
    public String getName(){

        return firstName + " " + lastname;
    }
    public void setName(String name){
        String[] firstNameAndLastName = name.split("");

        this.firstName = firstNameAndLastName[0];
        this.lastname = firstNameAndLastName[1];
    }
}
