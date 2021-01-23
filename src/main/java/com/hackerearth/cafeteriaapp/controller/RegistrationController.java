package com.hackerearth.cafeteriaapp.controller;

import com.hackerearth.cafeteriaapp.entity.Employee;
import com.hackerearth.cafeteriaapp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<Employee> registerUser(@RequestBody Employee employee,
                                                  @RequestParam(name = "empImg",
                                                          required = false)
                                                          MultipartFile empImg) {
        registrationService.register(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
