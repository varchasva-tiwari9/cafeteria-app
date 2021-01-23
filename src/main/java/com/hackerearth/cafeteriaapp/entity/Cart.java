package com.hackerearth.cafeteriaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "item_id")
    private int item_id;

    @Column(name = "emp_id")
    private int emp_id;
}
