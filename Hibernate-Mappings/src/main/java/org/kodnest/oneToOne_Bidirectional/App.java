package org.kodnest.oneToOne_Bidirectional;

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
    	Bike b1=new Bike();
    	Bike b2=new Bike();
    	Bike b3=new Bike();
    	Student s1=new Student(433, "Suleman", 80, b3);
    	Student s2=new Student(438, "Raju", 75, b1);
    	Student s3=new Student(439, "Dinesh", 81, b2);
    	b1.setReg_num(111);
    	b1.setModel("KTM");
    	b1.setCost(125000);
    	b1.setStudent(s2);
    	
    	b2.setReg_num(222);
    	b2.setModel("YAMAHA");
    	b2.setCost(155000);
    	b2.setStudent(s3);
    	
    	b3.setReg_num(333);
    	b3.setModel("Royal Enfiled");
    	b3.setCost(325000);
    	b3.setStudent(s1
    			);
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
