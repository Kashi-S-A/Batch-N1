package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Employee emp = em.find(Employee.class, 108);
		
		if (emp!=null) {
			emp.setSalary(50000);
			em.merge(emp);
			et.commit();
			
			System.out.println("salary updated");
		} else {
			System.out.println("not found");
		}
	}
}
