package com.example.demo_spring_api.service;

import com.example.demo_spring_api.repository.EmployeeRepository;
import com.example.demo_spring_api.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmp() {
        return employeeRepository.getAllEmp();
    }

    @Override
    public Employee getEmpById(int id) {
        return employeeRepository.getEmpById(id);
    }

    @Override
    public int saveEmp(Employee e) {
        return employeeRepository.saveEmp(e);
    }

    @Override
    public int deleteEmpById(int id) {
        return employeeRepository.deleteEmpById(id);
    }


}
