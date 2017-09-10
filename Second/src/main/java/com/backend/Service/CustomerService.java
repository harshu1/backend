package com.backend.Service;
import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.backend.Dao.*;
import com.backend.model.*;
@Service("customerService")
@Transactional

public class CustomerService {
	  @Autowired
			public CustomerDao u;
			
			public void insertservice(Customer U){
				//e.insert(p);
		      u.insertUser(U);

				
			}	
			
			public void deleteservice(int uid){
				u.deleteUser(uid);
			}
			public void updateservice(Customer U){
				// T000 Auto generated method stub
			u.updateUser( U);
				
				
			}
			
			public Customer viewbyidUser(int uid)
			{
				return  u.viewbyidUser(uid);
				
			}
				public List<Customer>viewAllUser()
				{
				return  u.getAllUsers();
					//return li;
				}

}
