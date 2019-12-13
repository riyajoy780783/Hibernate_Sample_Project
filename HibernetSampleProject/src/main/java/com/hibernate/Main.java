package com.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("Riya");
		user.setGender("Female");
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
		
		//cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		
		Transaction tx = session.beginTransaction();
		session.save(user);
		//System.out.println("saved successfully");
		tx.commit();
		
	}

}
