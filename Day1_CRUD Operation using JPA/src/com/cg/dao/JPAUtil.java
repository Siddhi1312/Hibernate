package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil //java persistence application utility
{
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
		//jpa-pu is persistence unit
		
	}
	
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;//object of entityManager
	}

}
