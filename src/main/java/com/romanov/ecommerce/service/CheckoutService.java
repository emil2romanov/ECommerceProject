package com.romanov.ecommerce.service;

import com.romanov.ecommerce.dto.Purchase;
import com.romanov.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placedOrder(Purchase purchase);
}
