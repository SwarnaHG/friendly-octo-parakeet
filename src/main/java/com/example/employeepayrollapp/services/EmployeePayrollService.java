package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService {
    @Autowired
    EmployeePayrollRepository repository;

    public Employee postdata(Employee employee) {
        repository.save(employee);
        return employee;
    }

    public Employee saveData(Employee empData) {
        repository.save(empData);
        return empData;
    }

    public Optional<Employee> findById(Long id) {
        return repository.findById(Math.toIntExact(id));
    }

    public List<Employee> findAllData() {
        return (List<Employee>) repository.findAll();
    }

    public Employee editdata(Employee employee, Integer id) {
        Optional<Employee> toedit = repository.findById(id);
       // if (toedit != null) {
         //   toedit.setId(employee.getId());
           // toedit.setFirstName(employee.getFirstName());
            //toedit.setLastName(employee.getLastName());
          //  toedit.setAddress(employee.getAddress());
            //toedit.setSalary(employee.getSalary());
            //toedit.setProfilePic(employee.getProfilePic());
            //toedit.setNote(employee.getNote());
            //toedit.setStartDate(employee.getStartDate());
          //  return repository.save(toedit);
        //} else {
          //  return null;
        //}
        if(toedit.isEmpty()){
            return null;

        }
        Employee emp=new Employee(id,employee);
       // repository.save(emp);
        return repository.save(emp);
    }

    public Employee updateDataById(Integer id, Employee employee) {
        Employee newEmployee = new Employee(id, employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getSalary(), employee.getProfilePic(), employee.getNote(), employee.getStartDate());
        repository.save(newEmployee);
        return newEmployee;
    }

    public void deletedata(Integer id) {
        repository.deleteById(id);
    }
}











