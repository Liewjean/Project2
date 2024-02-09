package com.javaguides.springboot.service.impl;

import com.javaguides.springboot.model.Employee;
import com.javaguides.springboot.repository.EmpRepository;
import com.javaguides.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpRepository empRepository;
    @Override
    public Employee create(Employee employee){
        return empRepository.save(employee);
    }
}
