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

		Bank bank = new Bank(102, "HDFC");

		Account a1 = new Account(333, "C");

		Account a2 = new Account(444, "D");
		
//		List<Account> acc = new ArrayList<Account>();
//		acc.add(a1);
//		acc.add(a2);
//		
//		bank.setAccounts(acc);
		
		bank.setAccounts(Arrays.asList(a1,a2));
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		System.out.println("saved");
	}
}
