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

		Car c = new Car(101, "TATA");

		Engine e = new Engine(222,1000);
		
		c.setEngine(e);

		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
		
		System.out.println("saved");
	}
}
