package com.rutuja.spring.boot.payroll.application.repository;


import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {
}