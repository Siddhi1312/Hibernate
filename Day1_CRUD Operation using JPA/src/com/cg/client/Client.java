package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Employee emp=new Employee();
		/*//create operation
		emp.setID(103);
		emp.setName("samarth");
		service.addEmployee(emp);*/
		
		/*//retrieve
		emp=service.getEmployeeById(102);
		System.out.println("ID: "+emp.getID());
		System.out.println("Name: "+emp.getName());*/
		
		/*//update 
		emp=service.getEmployeeById(101);
		emp.setName("shrija");
		service.updateEmployee(emp);*/
		
		//Delete
		emp=service.getEmployeeById(101);
		service.removeEmployee(emp);
		

	}

}
