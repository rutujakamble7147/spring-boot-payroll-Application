package com.rutuja.spring.boot.payroll.application.assemblers;


import com.rutuja.spring.boot.payroll.application.Controllers.OrderController;
import com.rutuja.spring.boot.payroll.application.model.Order;
import com.rutuja.spring.boot.payroll.application.model.Status;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;



@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {

    @Override
    public EntityModel<Order> toModel(Order order) {

        // Unconditional links to single-item resource and aggregate root

        EntityModel<Order> orderModel = EntityModel.of(order,
                linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("all_orders"));

        // Conditional links based on state of the order

        if (order.getStatus()==Status.IN_PROGRESS){
            orderModel.add(linkTo(methodOn(OrderController.class).cancel(order.getId())).withRel("cancle"));
        }

        return orderModel;
    }
}