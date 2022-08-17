package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class employeeDaoImpl implements employeeDao 
{
	//entityManager method for crud operation
	private EntityManager em;
	
    //default constructor
	public employeeDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee emp) 
	{
		em.persist(emp);//to add-persist method
		
	}

	public void updateEmployee(Employee emp) {
		em.merge(emp);//to update-merge method
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

}
