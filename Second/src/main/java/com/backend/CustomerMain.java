package com.backend;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
//import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.backend.Dao.*;
import com.backend.Service.*;
import com.backend.configuration.AppCfg;
import com.backend.model.*;
public class CustomerMain {
	public static void main(String a[])
	{
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppCfg.class);
  	//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:hibernate.xml");  
  	
  CustomerService cservice = (CustomerService) context.getBean("customerService");
  ProductService proservice = (ProductService) context.getBean("productService");
  OrderService or = (OrderService) context.getBean("billableService");
  
  
  
  /*C1 object*/
  Customer c1=new Customer();
c1.setName("Abz");
c1.setPhone(78966728);
c1.setEmail("xu@gmail.com");
c1.setAddress("A17Saket");
//cservice.insertservice(c1);

/*--------------*/
Order o1=new Order();
o1.setStatus("Diliverd");
o1.setCustomer(c1);
Product p1=proservice.viewbyidProduct(101);
Product p2=proservice.viewbyidProduct(103);
p1.setStock(2);
p2.setStock(3);
Set<Product> s1=new TreeSet<Product>();
s1.add(p1);
s1.add(p2);
o1.setProduct(s1);
/*--------------------------------------------------------------------------------*/
/*c2 object object 2 */
Customer c2=new Customer();
c2.setName("Nishant");
c2.setPhone(2344828);
c2.setEmail("nishu@gmail.com");
c2.setAddress("60/A, sec-1,DDA FLat,Saket");
//cservice.insertservice(c2);
/*-----------*/
Order o2=new Order();
o2.setStatus("Shipped");
o2.setCustomer(c2);
//o2.setProduct(Product);
/*--------------------------------------------------------------------------------*/
/*c3 object*/
/*Customer c3=new Customer();
c3.setName("Aditya");
c3.setAddress("hno.129Gaziabad");
c3.setEmail("adi@gmail.com");
c3.setPhone(8993678);
cservice.insertservice(c3);
/*------------*/
/*Order o3=new Order();

o3.setStatus("Delivered");
o3.setCustomer(c3);
/*--------------------------------
 * ---------------------------------object insertservice
 */
or.insertservice(o1);
//or.insertservice(o2);
//or.insertservice(o3);


//service.insertservice(Product3);

/*
 * Get all Products list from database
 */
List<Customer> Cust = cservice.viewAllUser();
for (Customer emp : Cust) {
    System.out.println(emp);
}

  // service.deleteservice("002");

/*
 *update an Product
          Product p = service.findBySsn("id");
    p.setPrice(new BigDecimal(4500));
    service.updateservice(p);


 


    /*
 * Get all Products list from database
 */
List<Customer> CustomerList = cservice.viewAllUser();
for (Customer emp : CustomerList) {
    System.out.println(emp);
}

//context.close();

   // System.out.println( "Hello World!" );
}



}

