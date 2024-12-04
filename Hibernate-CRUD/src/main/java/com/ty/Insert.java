package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Employee employee = new Employee();
		employee.setEid(103);
		employee.setName("Manga");
		employee.setSalary(30000);
		
		et.begin();
		em.persist(employee);
		et.commit();
		
		System.out.println("saved");
		
	}
}
