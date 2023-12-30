package com.kn.ManyToMany;

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
		Technologies t1=new Technologies();
		Technologies t2=new Technologies();
		Technologies t3=new Technologies();
		Technologies t4=new Technologies();
		List<Technologies> emp1=new ArrayList<Technologies>();
		emp1.add(t1);
		emp1.add(t3);
		List<Technologies> emp2=new ArrayList<Technologies>();
		emp2.add(t2);
		emp2.add(t4);
		List<Technologies> emp3=new ArrayList<Technologies>();
		emp3.add(t1);
		emp3.add(t2);
		List<Technologies> emp4=new ArrayList<Technologies>();
		emp4.add(t3);
		emp4.add(t4);
		List<Technologies> emp5=new ArrayList<Technologies>();
		emp5.add(t1);
		emp5.add(t2);
		emp5.add(t3);
		emp5.add(t4);
		
		Employee ep1=new Employee(1, "Ankit", "A", emp1);
		Employee ep2=new Employee(2, "Amit", "B", emp2);
		Employee ep3=new Employee(3, "Ankush", "A", emp3);
		Employee ep4=new Employee(4, "Anwar", "C", emp4);
		Employee ep5=new Employee(5, "Adharsh", "A", emp5);
		List<Employee> tech1=new ArrayList<Employee>();
		tech1.add(ep1);
		tech1.add(ep3);
		tech1.add(ep5);
		List<Employee> tech2=new ArrayList<Employee>();
		tech2.add(ep5);
		tech2.add(ep2);
		tech2.add(ep3);
		List<Employee> tech3=new ArrayList<Employee>();
		tech3.add(ep5);
		tech3.add(ep4);
		tech3.add(ep1);
		List<Employee> tech4=new ArrayList<Employee>();
		tech4.add(ep5);
		tech4.add(ep3);
		tech4.add(ep5);
		
		t1.setId(111);
		t1.setSkill("JAVA");
		t1.setEmployee(tech1);
		
		t2.setId(222);
		t2.setSkill("Python");
		t2.setEmployee(tech2);
		
		t3.setId(333);
		t3.setSkill("SQL");
		t3.setEmployee(tech3);
		
		t4.setId(444);
		t4.setSkill("React");
		t4.setEmployee(tech4);
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory fact= conf.buildSessionFactory();
		Session s= fact.openSession();
		Transaction txn= s.beginTransaction();
		s.save(t1);
		s.save(t2);
		s.save(t3);
		s.save(t4);
		
		s.save(ep1);		
		s.save(ep2);		
		s.save(ep3);		
		s.save(ep4);		
		s.save(ep5);
		txn.commit();
		System.out.println("Data stored and Related to Each other");

	}
}
