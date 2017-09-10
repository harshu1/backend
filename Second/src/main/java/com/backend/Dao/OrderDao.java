package com.backend.Dao;

import java.util.List;

import com.backend.model.Order;

public interface OrderDao {

	List<Order> getAllList();
	 Order viewbyid(int bid);
	public void edit(Order o);
	public void delete(int bid);
	void save(Order b);
	
}
