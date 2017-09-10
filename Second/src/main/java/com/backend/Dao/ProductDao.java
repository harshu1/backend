package com.backend.Dao;
import java.util.*;




import com.backend.model.Product;
public interface ProductDao {
	public void insertProduct(Product P);
		 List<Product> getAllProducts();
		 Product viewbyidProduct(int id);
		public void updateProduct(Product P);
		public void deleteProduct(int id);
		
		

	}
