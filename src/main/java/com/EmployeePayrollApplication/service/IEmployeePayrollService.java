package com.EmployeePayrollApplication.service;

import java.util.List;

import com.EmployeePayrollApplication.DTO.EmployeePayrollDTO;
import com.EmployeePayrollApplication.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
