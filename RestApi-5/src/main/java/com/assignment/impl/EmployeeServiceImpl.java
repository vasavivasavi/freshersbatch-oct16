package com.assignment.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.bean.Employee;
import com.assignment.repository.EmployeeRepository;
import com.assignment.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repo;



   @Override
    public List<Employee> showAllEmployee() {
        return repo.findAll();
    }



   @Override
    public Employee showById(int id) {
        Optional<Employee> employee = repo.findById(id);
        Employee e = null;
        if(employee.isPresent())
            e=employee.get();
        return e;
    }



   @Override
    public Employee addEmployee(Employee employee) {
        return repo.insert(employee);
    }



   @Override
    public Employee updateEmployee(Employee e) {
        return repo.save(e);
    }



   @Override
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }



}