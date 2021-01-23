package com.hackerearth.cafeteriaapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "item_id")
    private int item_id;

    @Column(name = "emp_id")
    private int emp_id;
}
