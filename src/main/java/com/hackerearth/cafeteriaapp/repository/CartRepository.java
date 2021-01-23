package com.hackerearth.cafeteriaapp.repository;

import com.hackerearth.cafeteriaapp.entity.Cart;
import com.hackerearth.cafeteriaapp.model.EmployeeFoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query(value = "SELECT fi.*, c.emp_id, c.quantity FROM food_item fi " +
            "INNER JOIN cart c" +
            "ON fi.item_id = c.item_id" +
            "WHERE c.emp_id = :empId", nativeQuery = true)
    List<EmployeeFoodItem> getCartItems(@Param("empId") String empId);
}
