package com.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignment.bean.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {



}