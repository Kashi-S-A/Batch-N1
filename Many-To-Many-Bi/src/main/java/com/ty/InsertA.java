package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student=new Student();
		student.setStuId(102);
		student.setName("Dingi");
		
		Subject subJava = em.find(Subject.class, 111);
		
		Subject subSql = em.find(Subject.class, 222);
		
		Subject subHtml=new Subject();
		subHtml.setSubId(444);
		subHtml.setName("HTML");
		
		student.setSubjects(Arrays.asList(subJava,subSql,subHtml));
		
		et.begin();
		em.persist(student);
		em.persist(subHtml);
		et.commit();
	}
}
