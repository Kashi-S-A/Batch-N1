package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBySubject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Subject subject = em.find(Subject.class, 333);

		if (subject != null) {
			System.out.println("----subject----");
			System.out.println(subject.getSubId());
			System.out.println(subject.getName());

			List<Student> students = subject.getStudents();

			System.out.println("-----------students-----------");
			for (Student student : students) {
				System.out.println(student.getStuId());
				System.out.println(student.getName());
				System.out.println("======================");
			}
		} else {
			System.out.println("not found");
		}

	}
}
