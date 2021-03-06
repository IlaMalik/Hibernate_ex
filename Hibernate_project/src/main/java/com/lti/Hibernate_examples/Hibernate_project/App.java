package com.lti.Hibernate_examples.Hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder =
    			new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory= configuration.buildSessionFactory(builder.build());
    	Session session = factory.openSession();
    	Employee employee = new Employee();
    	employee.setEmpName("Ila");
    	employee.setBranch("Noida");
    	session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();	
    }
}
