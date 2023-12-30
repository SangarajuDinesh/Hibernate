package org.kodnest.hibernate_demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory factory=con.buildSessionFactory();
        System.out.println( "Hibernate Started working "+factory);
    }
}
