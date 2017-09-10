package com.backend.Dao;

import java.util.List;


import com.backend.model.Customer;


public interface CustomerDao {
	 List<Customer> getAllUsers();
	 Customer viewbyidUser(int uid);
	public void updateUser(Customer U);
	public void deleteUser(int uid);
	void insertUser(Customer u);
	

}
