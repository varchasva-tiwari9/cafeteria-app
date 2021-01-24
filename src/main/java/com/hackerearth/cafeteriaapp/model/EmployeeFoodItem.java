package com.hackerearth.cafeteriaapp.model;

import com.hackerearth.cafeteriaapp.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeFoodItem {
    private String empId;
    private Integer itemId;
    private String itemName;
    private String itemPath;
    private Double price;
    private Integer quantity;
    private Boolean isAvailable;
}
