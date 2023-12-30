package com.kn.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fact=cfg.buildSessionFactory();
		Session s= fact.openSession();
		Transaction txn= s.beginTransaction();
		Products p1=new Products();
		Products p2=new Products();
		Products p3=new Products();
		Products p4=new Products();
		List<Products> lst1=new ArrayList<Products>();
		lst1.add(p1);
		lst1.add(p2);
		List<Products> lst2=new ArrayList<Products>();
		lst2.add(p3);
		lst2.add(p4);
		Customer c1=new Customer(01, "Arun", 35, lst1);
		Customer c2=new Customer(02, "Ankit", 30, lst2);
		p1.setId(111);
		p1.setName("Keyboard");
		p1.setCost(1500);
		p1.setCustomer(c1);
		
		p2.setId(222);
		p2.setName("Mouse");
		p2.setCost(500);
		p2.setCustomer(c1);
		
		p3.setId(333);
		p3.setName("TV");
		p3.setCost(35000);
		p3.setCustomer(c2);
		
		p4.setId(444);
		p4.setName("Laptop");
		p4.setCost(55000);
		p4.setCustomer(c2);
		
		s.save(c1);
		s.save(c2);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(p4);
		txn.commit();
		System.out.println("Data stored and related");
		
	}
}
