package com.backend.Dao;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.List;

import com.backend.model.*;
import com.backend.Dao.CustomerDao;

import com.backend.model.Customer;
@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao implements CustomerDao{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void insertUser(Customer U) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(U);
		logger.info("Customer saved successfully, Customer Details="+U);
	}
	
			
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Customer> CustomersList = session.createQuery("from Customer").list();
		for(Customer U : CustomersList){
			logger.info("Customer List::"+U);
		}
		return CustomersList;

	}
	
		

	
	public Customer viewbyidUser(int uid) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Customer p = (Customer) session.load(Customer.class, new Integer(uid));
		logger.info("Customer loaded successfully, Customer details="+p);
		return p;
	}


	
	public void updateUser(Customer U) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(U);
		logger.info("Customer updated successfully, Customer Details="+U);
	}


	


	
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(uid));
		if(null != p){
			session.delete(p);
		}
		logger.info("Customer deleted successfully, Customer details="+p);
	}

}
