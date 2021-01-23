package com.hackerearth.cafeteriaapp.model;

import com.hackerearth.cafeteriaapp.entity.FoodItem;

import javax.persistence.Column;

public class EmployeeFoodItem {
    private String empId;
    private Integer itemId;
    private String itemName;
    private String itemPath;
    private Double price;
    private Integer quantity;
    private Boolean isAvailable;
}