package com.hackerearth.cafeteriaapp.service.implementations;

import com.hackerearth.cafeteriaapp.entity.FoodItem;
import com.hackerearth.cafeteriaapp.repository.FoodRepository;
import com.hackerearth.cafeteriaapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodServiceImpl implements FoodService {

  @Autowired
  private FoodRepository foodRepository;

    @Override
    public List<FoodItem> getFoodItems() {
        return foodRepository.findAll();
    }
}
