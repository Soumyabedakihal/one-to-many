package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one-to-many.Hospti;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		
		hospital.setGetNumber(12);
		hospital.setName("adhya");
		hospital.setWeb("www.adhya.com");
		
		Branch branch1=new Branch();
		branch1.setName("xyz");
		branch1.setAddress("sjb");
		branch1.setPhone(980877);
		
		Branch branch2=new Branch();
		branch2.setName("abc");
		branch2.setAddress("rgh");
		branch2.setPhone(232);
		
		Branch branch3=new Branch();
		branch3.setName("kjh");
		branch3.setAddress("shj");
		branch3.setPhone(7345);
		
		List<Branch> branch=new ArrayList();
		branch.add(branch1);
		branch.add(branch2);
		branch.add(branch3);
		
		entityTransaction.begin();
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(hospital);
		entityTransaction.commit();
	}

}
