package com.javaguides.springboot.controller;

import com.javaguides.springboot.model.Employee;
import com.javaguides.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;
    @GetMapping("/employee")
    public String index(){
        return "Hello World";
    }

    @PostMapping("/create")
    public Employee savedEmp(@RequestBody Employee employee){
        return empService.create(employee);
    }
}
