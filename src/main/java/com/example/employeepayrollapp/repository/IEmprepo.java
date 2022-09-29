package com.example.employeepayrollapp.repository;
import com.example.employeepayrollapp.dto.EmployeeDto;
import com.example.employeepayrollapp.model.EmpData;

import java.util.List;


public interface IEmprepo {
    public EmpData save(EmployeeDto employeeDto);
    public EmpData update(Integer id,EmployeeDto employeeDto);
    public EmpData delete(Integer id);
    public List<EmpData> getAllData();

}
