package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.enitites.Product;

public class HibernateMain {
	public static void main(String[] args) {

		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Product p = new Product();
		p.setProductId(1);
		p.setName("Iwatch");
		p.setBrand("Apple");
		p.setPrice(75000f);

		s.save(p);

		t.commit();
		s.close();

	}
}
