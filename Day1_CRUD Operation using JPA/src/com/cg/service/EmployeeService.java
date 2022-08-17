package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	Employee getEmployeeById(int ID);
	void removeEmployee(Employee emp);

}
