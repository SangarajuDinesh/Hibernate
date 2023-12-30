package org.kodnest.Hibernate_Demo4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Employee emp=new Employee(433,"Suleman", 31200);
    	Employee emp2=new Employee(439,"Dinesh", 27000);
    	Employee emp3=new Employee(438,"Raju", 30000);
    	Department dept=new Department(01, "Technical");
    	Department dept1=new Department(02, "Testing");
    	Department dept2=new Department(03, "HR");
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory fact= con.buildSessionFactory();
    	Session s= fact.openSession();
    	Transaction txn= s.beginTransaction();
    	s.save(emp); 
    	s.save(emp2);
    	s.save(emp3);
    	s.save(dept);
    	s.save(dept1);
    	s.save(dept2);
    	txn.commit();
    	System.out.println("Tables created and Data inserted succesfully");
    }
}
