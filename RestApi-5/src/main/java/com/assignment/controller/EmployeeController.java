package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.bean.Employee;
import com.assignment.service.EmployeeService;

@RestController
@RequestMapping("/employee1")
public class EmployeeController {
    
    @Autowired
    EmployeeService service;
    
    @GetMapping("/")
    public List<Employee> showAllEmployee(){
        return service.showAllEmployee();
    }
    
    @GetMapping("/{id}")
    public Employee showEmployeeById(@PathVariable("id")int id) {
        return service.showById(id);
    }
    
    @PostMapping("/addemployee1")
    public Employee addEmployee(@RequestBody Employee e) {
        return service.addEmployee(e);
    }
    @PutMapping("/updateemployee1")
    public Employee updateEmployee(@RequestBody Employee e) {
        return service.updateEmployee(e);
    }



   @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id")int id) {
        service.deleteEmployee(id);
    }
}

