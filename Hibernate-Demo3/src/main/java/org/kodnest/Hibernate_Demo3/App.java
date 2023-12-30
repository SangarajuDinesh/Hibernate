package org.kodnest.Hibernate_Demo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp=new Employee(439, "Suresh", 35000);
    	Employee emp1=new Employee(433, "Dinesh", 25000);
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory fact= cfg.buildSessionFactory();
    	Session s=fact.openSession();
    	Transaction  trn=s.beginTransaction();
    	s.saveOrUpdate(emp1);
    	trn.commit();
    	System.out.println(emp+" is stored ");
    	System.out.println(emp1+" is stored ");
    }
}
