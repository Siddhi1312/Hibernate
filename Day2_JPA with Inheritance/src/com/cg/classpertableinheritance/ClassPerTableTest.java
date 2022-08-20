package com.cg.classpertableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//employee 1
		EmployeeN emp2=new EmployeeN();
		emp2.setName("shriji");
		emp2.setSalary(30000);
		em.persist(emp2);
		//employee 2
		EmployeeN emp3=new EmployeeN();
		emp3.setName("riddhi");
		emp3.setSalary(30000);
		em.persist(emp3);
		//create manager
		ManagerN m1 =new ManagerN();
		m1.setName("parag");
		m1.setSalary(80000);
		m1.setDeptName("IT");
		em.persist(m1);
		
		em.getTransaction().commit();
		System.out.println("data is added");
		em.close();
		factory.close();

	}

}
