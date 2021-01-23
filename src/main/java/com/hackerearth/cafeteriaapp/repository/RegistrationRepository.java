package com.hackerearth.cafeteriaapp.repository;

import com.hackerearth.cafeteriaapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Employee, Integer> {
}
