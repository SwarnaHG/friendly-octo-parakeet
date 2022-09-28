package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeePayrollRepository extends CrudRepository<Employee, Integer> {



}
