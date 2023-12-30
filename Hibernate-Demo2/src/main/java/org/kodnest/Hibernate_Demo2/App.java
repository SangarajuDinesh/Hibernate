package org.kodnest.Hibernate_Demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student st1=new Student(439, "Dinesh", 81);
    	Student st2=new Student(433, "Suleman", 80);
    	Student st3=new Student(438, "Raju", 75);
    	Bike b1=new Bike(6666,"Pulsar", 125000);
    	Bike b2=new Bike(7777,"KTM", 220000);
    	Bike b3=new Bike(8888,"TVS", 50000);
    	
    	//1. Configure the hibernate.cfg.xml file
    	  Configuration cfg = new Configuration();
    	  cfg.configure(); // cfg.configure("hibernate.cfg.xml");

    	  //2. Build SessionFactory using configuration
    	  SessionFactory factory = cfg.buildSessionFactory();
    	  //3. Open Session using SessionFactory
    	  Session session = factory.openSession();
    	  //4. Begin Transaction using session
    	  Transaction txn = session.beginTransaction();
    	  session.save(st1);
    	  session.save(st2);
    	  session.save(st3);
    	  session.save(b1);
    	  session.save(b2);
    	  session.save(b3);
    	  //5. Commit the Transaction
    	  txn.commit();
    	  
    	  System.out.println(st1+" object has been stored in Database");
    	  System.out.println(st2+" object has been stored in Database");
    	  System.out.println(st3+" object has been stored in Database");
    	  System.out.println(b1+" object has been stored in Database");
    	  System.out.println(b2+" object has been stored in Database");
    	  System.out.println(b3+" object has been stored in Database");
    	
    }
}
