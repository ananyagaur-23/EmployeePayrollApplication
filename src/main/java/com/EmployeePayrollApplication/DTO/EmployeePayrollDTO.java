package com.EmployeePayrollApplication.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {
    public String name;
    public long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}