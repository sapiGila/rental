package com.rental.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.rental.interfaces.IHibernateTest;
import com.rental.model.entity.Movie;

import javax.inject.Named;

@Named
public class HibernateTest implements IHibernateTest {
	
	public static void main(String[] args) { 
//		createDb();
	}
	
	public static void createDb(){
		Configuration configuration = new Configuration();
		configuration.configure("/com/rental/config/hibernate.xml");
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				configuration.getProperties()).buildServiceRegistry();
		SessionFactory sf = configuration.buildSessionFactory(sr);

		Movie movie = new Movie();
		movie.setTitle("testD");

		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.save(movie);
		ss.getTransaction().commit();
		ss.close();
	}

	public String getMessage() {
		createDb();
		return "";
	}
}
