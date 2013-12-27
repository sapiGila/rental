package com.rental.controller;

import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;

import com.rental.interfaces.IHibernateTest;


@Named
@Scope("session")
public class HibernateMain {
	@Inject
	IHibernateTest hibernateTest;

	public IHibernateTest getHibernateTest() {
		return hibernateTest;
	}

	public void setHibernateTest(IHibernateTest hibernateTest) {
		this.hibernateTest = hibernateTest;
	}
	
	public String testHibernate(){
		return hibernateTest.getMessage();
		
	}
	
	
	
}
