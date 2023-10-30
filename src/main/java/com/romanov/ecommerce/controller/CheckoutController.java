package com.romanov.ecommerce.controller;

import com.romanov.ecommerce.dto.Purchase;
import com.romanov.ecommerce.dto.PurchaseResponse;
import com.romanov.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placedOrder(purchase);

        return purchaseResponse;
    }
}
