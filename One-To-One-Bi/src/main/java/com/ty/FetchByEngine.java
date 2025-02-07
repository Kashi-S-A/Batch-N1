package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByEngine {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Engine engine = em.find(Engine.class, 222);
		
		if (engine!=null) {
			System.out.println("-----------Engine-----------");
			System.out.println(engine.getEid());
			System.out.println(engine.getCc());
			
			Car car = engine.getCar();
			
			System.out.println("-------------car------------");
			System.out.println(car.getCid());
			System.out.println(car.getBrand());
		} else {
			System.out.println("not found");
		}
	}
}
