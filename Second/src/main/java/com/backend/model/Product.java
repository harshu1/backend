package com.backend.model;



import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Entity
@Table(name="PRODUCT")

public class Product implements Comparable<Product>{
	
	//import java.lang.*;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int pid;

	@Column(name = "CATEGORY", nullable = false)
	private String category;

	/*@Column(name = "JOINING_DATE", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joiningDate;*/

	@Column(name = "Price", nullable = false)
	private BigDecimal price;
	
	@Column(name = "DESCRIPTION")
	private String description;

	
		//String  category;
		//int price;
		int stock;
		//String size;
		//String company;
		/*public Product(int id,String name , BigDecimal i, int quantity ,String length)
		{
			this.pid=id;
			this.category=name;
			this.price=i;
			this.stock=quantity;
			this.size=length;
		}*/

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		    @Override
	    public String toString() {
	        return "Product [id=" + pid + ", Category=" + category + ", Stock="
	                + stock + ", Price=" + price + ", Description=" + description + "]";
	    }

		
	    

		public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

		public int compareTo(Product o) {
			// TODO Auto-generated method stub
			if(pid==o.pid)  
				return 0;  
				else if(pid>o.pid)  
				return 1;  
				else  
				return -1;  

		}

		
		}

