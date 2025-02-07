package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByAccount {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, 111);
		
		if (account!=null) {
			System.out.println("----------------Account-------------");
			System.out.println(account.getAcc());
			System.out.println(account.getName());
			
			Bank bank = account.getBank();
			
			System.out.println("---------bank-------------");
			System.out.println(bank.getBid());
			System.out.println(bank.getName());
		} else {
			System.out.println("not found");
		}
	}
}
