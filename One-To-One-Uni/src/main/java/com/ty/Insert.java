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

		Car c = new Car(103, "Audi", 4000000);

		Engine e = new Engine(333, 2000, "CNG");
		
		c.setEngine(e);

		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
		
		System.out.println("saved");
	}
}
