package com.romanov.ecommerce.service;

import com.romanov.ecommerce.dao.CustomerRepository;
import com.romanov.ecommerce.dto.Purchase;
import com.romanov.ecommerce.dto.PurchaseResponse;
import com.romanov.ecommerce.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placedOrder(Purchase purchase) {

        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with orderItems

        // populate order with billingAddress and shippingAddress

        // populate customer with order

        // save to database

        // return a response
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)

    }
}
