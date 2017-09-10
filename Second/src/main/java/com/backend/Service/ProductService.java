package com.backend.Service;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.backend.Dao.ProductDao;
import com.backend.Dao.ProductDaoImpl;
import com.backend.model.Product;
@Service("productService")
@Transactional

public class ProductService {
	
        @Autowired
		public ProductDao e;
		
		public void insertservice(Product P){
			//e.insert(p);
	        e.insertProduct(P);

			
		}	
		
		public void deleteservice(int id){
			e.deleteProduct(id);
		}
		public void updateservice(Product P){
			// T000 Auto generated method stub
			e.updateProduct( P);
			
			
		}
		
		public Product viewbyidProduct(int id)
		{
			return e.viewbyidProduct(id);
			
		}
			public List<Product>viewAllProduct()
			{
			return e.getAllProducts();
				//return li;
			}

			
				}

