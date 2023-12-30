package org.kodnest.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
	
	public static void main(String[] args)
	{
		create();
		read(439);
		update(433);
		delete(433);
		
	}

	private static void delete(int i)
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf= conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction txn= s.beginTransaction();
		s.delete(Student.class);
		txn.commit();
	}

	private static void update(int i)
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf= conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction txn= s.beginTransaction();
		s.update(Student.class);
		txn.commit();
	}

	private static void read(int id)
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf= conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction txn= s.beginTransaction();
		s.get(Student.class, id);
		txn.commit();
	}

	private static void create()
	{
		Student st=new Student(201,"DK", 81);
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf= conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction txn= s.beginTransaction();
		s.save(st);
		txn.commit();
		
	}
}
