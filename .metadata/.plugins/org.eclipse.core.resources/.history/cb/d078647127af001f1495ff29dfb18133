package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 102);
		
		if (student!=null) {
			System.out.println("----Student----");
			System.out.println(student.getStuId());
			System.out.println(student.getName());
			
			List<Subject> subjects = student.getSubjects();
			
			System.out.println("-----------Subject-----------");
			for (Subject subject : subjects) {
				System.out.println(subject.getSubId());
				System.out.println(subject.getName());
				System.out.println("======================");
			}
		} else {
			System.out.println("not found");
		}
		
	}
}
