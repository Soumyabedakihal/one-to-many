package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.Course;
import com.ty.manytomany.Student;

public class TestSaveMobileSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile m=new Mobile();
		m.setName("redmi");
		m.setCost(20000);
		
		Sim s1=new Sim();
		s1.setProvider("xyz");
		s1.setType("airtel");
		s1.setImei("xya123");
		
		Sim s2=new Sim();
		s2.setProvider("mnc");
		s2.setType("jio");
		s2.setImei("mns123");
		
		List<Sim> sim=new ArrayList();
		sim.add(s1);
		sim.add(s2);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(m);
		entityTransaction.commit();
	}

}
