package org.kodnest.hibernate_Demo1;

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
    	  //5. Commit the Transaction
    	  txn.commit();
    	  
    	  System.out.println(st1+" object has been stored in Database");
    	  System.out.println(st2+" object has been stored in Database");
    	  System.out.println(st3+" object has been stored in Database");
    	
    }
}
