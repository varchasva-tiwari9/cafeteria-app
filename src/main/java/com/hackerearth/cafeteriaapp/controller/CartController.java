package com.hackerearth.cafeteriaapp.controller;

import com.hackerearth.cafeteriaapp.entity.Cart;
import com.hackerearth.cafeteriaapp.model.EmployeeFoodItem;
import com.hackerearth.cafeteriaapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/item")
    public void setItem(@RequestBody Cart item) {
        cartService.storeCartItem(item);
    }

    @GetMapping("/items")
    public List<EmployeeFoodItem> getCartItems(@RequestParam("empId") String empId) {
        List<EmployeeFoodItem> cartItems = cartService.getCartItems(empId);
        return cartItems;
    }
}
