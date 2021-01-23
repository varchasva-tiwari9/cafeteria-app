package com.hackerearth.cafeteriaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_registration")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "id_path")
    private String idPath;

    @Column(name = "registration_id")
    private String registrationId;

    @Column(name = "registration_date")
    private Timestamp registrationDate;
}
