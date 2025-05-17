package com.EmployeePayrollApplication.service;

import org.springframework.stereotype.Service;

import com.EmployeePayrollApplication.DTO.EmployeePayrollDTO;
import com.EmployeePayrollApplication.model.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }
    
    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollList.stream().filter(emp -> emp.getId() == empId).findFirst().orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        int newId = employeePayrollList.size() + 1;
        EmployeePayrollData newEmp = new EmployeePayrollData(newId, employeePayrollDTO.name, employeePayrollDTO.salary);
        employeePayrollList.add(newEmp);
        return newEmp;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData emp = getEmployeePayrollDataById(empId);
        if (emp != null) {
            emp.setName(employeePayrollDTO.name);
            emp.setSalary(employeePayrollDTO.salary);
        }
        return emp;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollList.removeIf(emp -> emp.getId() == empId);
    }
}
