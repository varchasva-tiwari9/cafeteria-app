package com.hackerearth.cafeteriaapp.controller;

import com.hackerearth.cafeteriaapp.entity.FoodItem;
import com.hackerearth.cafeteriaapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/menu")
    public ResponseEntity<List<FoodItem>> getMenu() {
        List<FoodItem> menu = foodService.getFoodItems();
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }
}
