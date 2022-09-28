package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.services.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/emp")

public class EmpController {
    @Autowired
    EmployeePayrollService employeeService;

    @GetMapping("/get/{id}")
    public Employee employee(@PathVariable Integer id, @RequestParam String firstname, String lastname, String address, String salary, String pic, String note) {
        Employee emp = new Employee();
        emp.setId(Long.valueOf(id));
        emp.setFirstName(firstname);
        emp.setLastName(lastname);
        emp.setAddress(address);
        emp.setSalary(salary);
        emp.setProfilePic(pic);
        emp.setNote(note);
        return emp;
    }

    @PostMapping("/post")
    public Employee getdata(@RequestBody Employee employee) {
        Employee empData = employeeService.postdata(employee);
        return empData;
    }

    @PutMapping("/edit/{id}")
    public Employee editbyid(@PathVariable Integer id,@RequestBody Employee employee){
        return employeeService.updateDataById(id, employee);
    }
    @GetMapping("/getbyid{id}")
    public Optional<Employee> getById(@PathVariable Integer id){
        return employeeService.findById(Long.valueOf(id));
    }
    @DeleteMapping("/delete/{id}")
    public String deletebyid(@PathVariable Integer id){
        employeeService.deletedata(id);
        return "Employee with id:"+id+" deleted";
    }
}





