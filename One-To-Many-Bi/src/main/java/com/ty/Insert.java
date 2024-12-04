package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank bank = new Bank(101, "SBI");

		Account a1 = new Account(111, "A");
		a1.setBank(bank);

		Account a2 = new Account(222, "B");
		a2.setBank(bank);
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		System.out.println("saved");
	}
}
