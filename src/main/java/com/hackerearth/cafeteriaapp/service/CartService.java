package com.hackerearth.cafeteriaapp.service;

import com.hackerearth.cafeteriaapp.entity.Cart;
import com.hackerearth.cafeteriaapp.model.EmployeeFoodItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    void storeCartItem(Cart cart);

    List<EmployeeFoodItem> getCartItems(String empId);
}
