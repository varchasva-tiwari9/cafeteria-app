package com.hackerearth.cafeteriaapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackerearth.cafeteriaapp.entity.Employee;
import com.hackerearth.cafeteriaapp.service.RegistrationService;
import com.hackerearth.cafeteriaapp.service.implementations.AWSBucketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private AWSBucketServiceImpl awsBucketServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<Employee> registerUser(@RequestParam String employeeData,
                                                  @RequestParam(name = "empImg")
                                                          MultipartFile empImg) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(employeeData, Employee.class);

        URL url = awsBucketServiceImpl.saveFile(empImg);

        registrationService.registerUser(employee, url);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
