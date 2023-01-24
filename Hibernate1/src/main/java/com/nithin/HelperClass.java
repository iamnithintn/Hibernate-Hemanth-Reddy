package com.nithin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelperClass {

	public static void main(String[] args) {
		
		Mobiles m = new Mobiles();
		m.setBrand("Pixel 7");
		m.setCost(70999.99);

		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("nithin");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		em.persist(m);
		et.commit();
	}	
}