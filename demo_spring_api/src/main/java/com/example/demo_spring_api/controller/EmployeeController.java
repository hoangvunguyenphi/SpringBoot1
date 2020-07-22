package com.example.demo_spring_api.controller;

import com.example.demo_spring_api.modal.Employee;
import com.example.demo_spring_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getAllEmp() {
        return employeeService.getAllEmp();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmpById(@PathVariable int id){
        return employeeService.getEmpById(id);
    }

}
