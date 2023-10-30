package com.romanov.ecommerce.dto;

import com.romanov.ecommerce.entity.Address;
import com.romanov.ecommerce.entity.Customer;
import com.romanov.ecommerce.entity.Order;
import com.romanov.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
