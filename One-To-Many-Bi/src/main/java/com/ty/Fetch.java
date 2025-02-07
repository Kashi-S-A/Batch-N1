package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Bank bank = em.find(Bank.class, 101);

		if (bank != null) {
			System.out.println("-----------Bank------------");
			System.out.println(bank.getBid());
			System.out.println(bank.getName());

			List<Account> accounts = bank.getAccounts();
			System.out.println("---------------Accounts---------------");
			for (Account account : accounts) {
				System.out.println(account.getAcc());
				System.out.println(account.getName());
				System.out.println("================================");
			}
		} else {
			System.out.println("Not FOund");
		}
	}
}
