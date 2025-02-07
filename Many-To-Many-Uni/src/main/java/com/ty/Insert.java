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
		
		Student student=new Student();
		student.setStuId(101);
		student.setName("Dinga");
		
		Subject sub1=new Subject();
		sub1.setSubId(111);
		sub1.setName("JAVA");
		
		Subject sub2=new Subject();
		sub2.setSubId(222);
		sub2.setName("SQL");
		
		Subject sub3=new Subject();
		sub3.setSubId(333);
		sub3.setName("JS");
		
		student.setSubjects(Arrays.asList(sub1,sub2,sub3));
		
		et.begin();
		em.persist(student);
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);
		et.commit();
		
		System.out.println("saved");
	}
}
