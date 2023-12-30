package org.kodnest.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bike b1=new Bike(111,"Yamaha", 125000);
    	Bike b2=new Bike(222,"KTM", 225000);
    	Bike b3=new Bike(333,"Royal Enfield", 325000);
    	Student s1=new Student(433, "Suleman", 80, b3);
    	Student s2=new Student(438, "Raju", 75, b1);
    	Student s3=new Student(439, "Dinesh", 81, b2);
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory fact= con.buildSessionFactory();
    	Session s= fact.openSession();
    	Transaction txn= s.beginTransaction();
    	s.save(s1); 
    	s.save(s2);
    	s.save(s3);
    	s.save(b1);
    	s.save(b2);
    	s.save(b3);
    	txn.commit();
    	System.out.println("Tables created and Data Inserted...");
    }
}
