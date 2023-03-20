package com.rutuja.spring.boot.payroll.application.repository;



import com.rutuja.spring.boot.payroll.application.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {
}