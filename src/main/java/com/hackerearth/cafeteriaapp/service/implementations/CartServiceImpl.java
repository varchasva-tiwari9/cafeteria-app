package com.hackerearth.cafeteriaapp.service.implementations;

import com.hackerearth.cafeteriaapp.entity.Cart;
import com.hackerearth.cafeteriaapp.model.EmployeeFoodItem;
import com.hackerearth.cafeteriaapp.repository.CartRepository;
import com.hackerearth.cafeteriaapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void storeCartItem(Cart item) {
        cartRepository.save(item);
    }

    @Override
    public List<EmployeeFoodItem> getCartItems(String empId) {
        List<EmployeeFoodItem> employeeFoodItems=jdbcTemplate.query("SELECT fi.*, c.emp_id, c.quantity FROM food_item fi INNER JOIN cart c " +
          "ON fi.item_id = c.item_id " +
          "WHERE c.emp_id = :empId",new MapSqlParameterSource().addValue("empId",empId),
          BeanPropertyRowMapper.newInstance(EmployeeFoodItem.class));
        return employeeFoodItems;
    }
}
