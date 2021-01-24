package com.hackerearth.cafeteriaapp.repository;

import com.hackerearth.cafeteriaapp.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem,Integer> {
}
