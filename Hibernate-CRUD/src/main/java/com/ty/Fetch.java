package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();
		
		Employee employee= em.find(Employee.class, 101);
		
		if (employee!=null) {
			System.out.println("---------------Employee Details---------------");
			System.out.println(employee.getEid());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		} else {
			System.out.println("not found");
		}
	
	}
}
