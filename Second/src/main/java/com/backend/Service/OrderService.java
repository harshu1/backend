package com.backend.Service;
import java.util.ArrayList;


import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.backend.Dao.OrderDao;
import com.backend.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("billableService")
@Transactional

public class OrderService {
	@Autowired
	public OrderDao u;
	
	public void insertservice(com.backend.model.Order o){
		//e.insert(p);
      u.save(o);

		
	}	
	
	public void deleteservice(int uid){
		u.delete(uid);
	}
	public void updateservice(com.backend.model.Order o){
		// T000 Auto generated method stub
	u.edit( o);
		
		
	}
	
	public com.backend.model.Order viewbyid(int bid)
	{
		return  u.viewbyid(bid);
		
	}
		public List<com.backend.model.Order> viewAllUser()
		{
		return  u.getAllList();
			//return li;
		}

		





}
