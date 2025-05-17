package com.EmployeePayrollApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.EmployeePayrollApplication.DTO.EmployeePayrollDTO;
import com.EmployeePayrollApplication.model.EmployeePayrollData;
import com.EmployeePayrollApplication.service.IEmployeePayrollService;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable("id") int id) {
        return employeePayrollService.getEmployeePayrollDataById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO dto) {
        return employeePayrollService.createEmployeePayrollData(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable("id") int id, @RequestBody EmployeePayrollDTO dto) {
        return employeePayrollService.updateEmployeePayrollData(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeePayrollService.deleteEmployeePayrollData(id);
    }
}
