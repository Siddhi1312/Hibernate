package com.cg.dao;

import com.cg.entities.Employee;

public interface employeeDao//dao= data access object 
{
	//by default all methods are abstract in interface
	void addEmployee(Employee emp);//creation
	void updateEmployee (Employee emp);//updation
	Employee getEmployeeById (int ID);//retrieve//id is passed to get particular entity
	//here return type is employee i.e class 
	void removeEmployee (Employee emp);//delete
	
	void commitTransaction();//close an entity manager
	void beginTransaction();//begin an operation f entity manager

}
