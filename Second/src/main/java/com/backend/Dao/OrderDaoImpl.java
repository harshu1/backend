package com.backend.Dao;
import java.util.List;




import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.List;

import com.backend.model.*;
import com.backend.Dao.OrderDao;
@Repository("orderDao")

public class OrderDaoImpl extends AbstractDao implements OrderDao{
	
		@SuppressWarnings("unchecked")
	public List<Order> getAllList() {
        Criteria criteria = getSession().createCriteria(Order.class);
        return (List<Order>) criteria.list();

	}
	
		

	
	public Order viewbyid(int bid) {
		// TODO Auto-generated method stub
		 Criteria criteria = getSession().createCriteria(Order.class);
	        criteria.add(Restrictions.eq("",bid));
	        return (Order) criteria.uniqueResult();


	}



	
		
	public void edit(Order o) {
		// TODO Auto-generated method stub
		 ((OrderDao) getSession()).edit(o);
	}


	
	public void delete(int bid) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from Employee where  = :ssn");
        query.setLong("", bid);
        query.executeUpdate();

	}


	
	public void save(Order b) {
		// TODO Auto-generated method stub
	    persist(b);
	}



}
