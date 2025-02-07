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

		Product product = new Product();
		product.setPid(101);
		product.setName("Phone");
		product.setPrice(30000);

		Review r1 = new Review();
		r1.setRid(111);
		r1.setMessage("Good mobile");
		r1.setProduct(product);

		Review r2 = new Review();
		r2.setRid(222);
		r2.setMessage("User Friendly");
		r2.setProduct(product);

		Review r3 = new Review();
		r3.setRid(333);
		r3.setMessage("Worth for money");
		r3.setProduct(product);

		et.begin();
		em.persist(product);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();

		System.out.println("saved");

	}
}
