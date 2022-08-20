package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//employee 1
		Employee emp=new Employee();
		emp.setName("shriji");
		emp.setSalary(30000);
		em.persist(emp);
		//employee 2
		Employee emp1=new Employee();
		emp1.setName("riddhi");
		emp1.setSalary(30000);
		em.persist(emp1);
		//create manager
		Manager m =new Manager();
		m.setName("parag");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("data is added");
		em.close();
		factory.close();

	}

}
