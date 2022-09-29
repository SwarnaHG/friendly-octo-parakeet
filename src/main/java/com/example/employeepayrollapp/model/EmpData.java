package com.example.employeepayrollapp.model;


import com.example.employeepayrollapp.dto.EmployeeDto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EmpData {
    @Id
    @GeneratedValue
    private Integer id;
    public String name;
    public String salary;

    public EmpData(){

    }
    public Integer getId(){
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public EmpData(Integer id, EmployeeDto employeeDto){
        this.id=id;
        this.name=employeeDto.name;
        this.salary=employeeDto.salary;
    }

    public EmpData(EmployeeDto employeeDto){
        this.name=employeeDto.name;
        this.salary=employeeDto.salary;
    }
}
