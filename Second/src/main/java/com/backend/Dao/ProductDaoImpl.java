package com.backend.Dao;
import org.hibernate.Criteria;



import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.List;

import com.backend.model.Product;
import com.backend.Dao.ProductDao;
@Repository("productDao")
public class ProductDaoImpl extends AbstractDao implements ProductDao{
	
	
		//list is working as a database
			//List<Product> p;
			//public ProductDaoImpl(){
			//p = new ArrayList<Product>();
			//Product p1 = new Product(1,"Memory Card",360.00,30,"3GB");
			//Product p2 = new Product(1,"Hard Disk",360,30,"500GB");
			//p.add(p1);
			//p.add(p2);
			//}
			public void insertProduct(Product P) {
				// TODO Auto-generated method stub
		        persist(P);

			}
					
			
			@SuppressWarnings("unchecked")
			public List<Product> getAllProducts() {
		        Criteria criteria = getSession().createCriteria(Product.class);
		        return (List<Product>) criteria.list();

			}
			
			public void updateProduct(Product P) {
		        getSession().update(P);
}
			
			public Product viewbyidProduct(int id) {
				// TODO Auto-generated method stub
		        Criteria criteria = getSession().createCriteria(Product.class);
		        criteria.add(Restrictions.eq("pid",id));
		        return (Product) criteria.uniqueResult();

			}

			public void deleteProduct(int id) {
				// TODO Auto-generated method stub
				 Query query = getSession().createSQLQuery("delete from Employee where pid = :pid");
			       
				query.setInteger("pid", id);
			        query.executeUpdate();
				 

			}
		
	}


