package com.hackerearth.cafeteriaapp.service.implementations;

import com.hackerearth.cafeteriaapp.entity.Employee;
import com.hackerearth.cafeteriaapp.repository.RegistrationRepository;
import com.hackerearth.cafeteriaapp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public void registerUser(Employee employee, URL url) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String regId = currentDateTime.getDayOfMonth() + "" + currentDateTime.getMonthValue() + "" +
                currentDateTime.getYear() + "" + currentDateTime.getHour() + "" + currentDateTime.getMinute()
                + "" + currentDateTime.getSecond();
        employee.setRegistrationId(regId);
        employee.setRegistrationDate(Timestamp.valueOf(currentDateTime));
        employee.setIdPath(url.toString());

        registrationRepository.save(employee);
    }
}
