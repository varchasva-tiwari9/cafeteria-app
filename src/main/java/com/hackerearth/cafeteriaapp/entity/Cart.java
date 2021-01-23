package com.hackerearth.cafeteriaapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @Column(name = "id")
    private int id;
}
