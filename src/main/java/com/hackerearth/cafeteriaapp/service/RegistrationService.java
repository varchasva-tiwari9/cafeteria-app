package com.hackerearth.cafeteriaapp.service;

import com.hackerearth.cafeteriaapp.entity.Employee;
import com.hackerearth.cafeteriaapp.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;

@Service
public interface RegistrationService {
    public void registerUser(Employee employee, URL url);
}
