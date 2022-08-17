package com.cg.service;

import com.cg.dao.employeeDao;
import com.cg.dao.employeeDaoImpl;
import com.cg.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	private employeeDao dao;
	

	public EmployeeServiceImpl() {
		super();
		dao = new employeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=dao.getEmployeeById(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) 
	{
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		
	}


}
