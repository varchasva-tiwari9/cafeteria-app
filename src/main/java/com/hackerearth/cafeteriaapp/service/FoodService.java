package com.hackerearth.cafeteriaapp.service;

import com.hackerearth.cafeteriaapp.entity.FoodItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {
    public List<FoodItem> getFoodItems();
}
