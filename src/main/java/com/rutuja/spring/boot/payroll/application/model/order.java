package com.rutuja.spring.boot.payroll.application.model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "CUSTOMER_ORDER")
public class order {
        private @Id
    @GeneratedValue Long id;

        private String description;
        private Status status;

       void Order(){}

    public order( String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof order order)) return false;
        return getId().equals(order.getId()) && getDescription().equals(order.getDescription()) && Objects.equals(getStatus(), order.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getStatus());
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
