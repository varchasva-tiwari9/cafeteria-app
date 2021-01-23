package com.hackerearth.cafeteriaapp.service.implementations;

import com.hackerearth.cafeteriaapp.entity.Cart;
import com.hackerearth.cafeteriaapp.model.EmployeeFoodItem;
import com.hackerearth.cafeteriaapp.repository.CartRepository;
import com.hackerearth.cafeteriaapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public void storeCartItem(Cart item) {
        cartRepository.save(item);
    }

    @Override
    public List<EmployeeFoodItem> getCartItems(String empId) {
        return cartRepository.getCartItems(empId);
    }
}
