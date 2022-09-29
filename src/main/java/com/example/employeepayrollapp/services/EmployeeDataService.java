package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.dto.EmployeeDto;
import com.example.employeepayrollapp.model.EmpData;
import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.repository.IEmprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDataService implements IEmprepo {
    @Autowired
    IEmprepo empDataRepository;

    //uc2 and uc3
    public EmpData save(EmployeeDto employeeDto) {
        EmpData emp=new EmpData(employeeDto);
        return empDataRepository.save(empData);
    }
    public EmpData update(Integer id,EmployeeDto employeeDto){
        EmpData emp=new EmpData(id,employeeDto);
        empDataRepository.save(empData);
        return empData;

    }
    public EmpData delete(Integer id) {
        empDataRepository.deleteByid(id);
        return null;
    }
    public List<EmpData> getAllData() {
        return empDataRepository.findAll();
    }

}
