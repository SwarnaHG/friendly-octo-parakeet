package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDto;
import com.example.employeepayrollapp.dto.ResponseDto;
import com.example.employeepayrollapp.model.EmpData;
import com.example.employeepayrollapp.services.EmployeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empdata")
public class EmpDataController {
    @Autowired
    EmployeeDataService empDataService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save(@RequestBody EmployeeDto employeeDto){
        EmpData empdata=null;
         EmpData empData=empDataService.save(employeeDto);
        ResponseDto responseDto=new ResponseDto("saved data successfully",empdata);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> update(@PathVariable Integer id,@RequestBody EmployeeDto employeeDto){
        EmpData empData=empDataService.update(id, employeeDto);
        ResponseDto responseDto=new ResponseDto("updated data successfully",empData);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Integer id){
        EmpData empData=empDataService.delete(id);
        ResponseDto responseDto=new ResponseDto( "deleted id:"+id+" successfully",empData);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @GetMapping("getall")
    public List<EmpData> getAll(){
        return empDataService.getAllData();
    }
}
