package com.example.demo_spring_api.service;

import com.example.demo_spring_api.modal.Employee;

import java.util.List;

public interface EmployeeService {
    List <Employee> getAllEmp();
    Employee getEmpById (int id);
    int saveEmp (Employee e);
    int deleteEmpById (int id);
}
