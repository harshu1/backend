package com.backend.model;
import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Type;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int uid;

	@Column(name = "NAME", nullable = false)
	String name;

	
	@Column(name = "PHONE", nullable = false)
	 int phone;
	
	@Column(name = "EMAIL")
	 String email;
/*
 * Mapping
 */
		@OneToMany(mappedBy = "customer")
		private Collection<Order> orders;


		public Collection<Order> getOrders() {
			return orders;
		}


		public void setOrders(Collection<Order> orders) {
			this.orders = orders;
		}


		//String  category;
		//int price;
		@Column(name = "ADDRESS")
		String address;


		public int getUid() {
			return uid;
		}


		public void setUid(int uid) {
			this.uid = uid;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getPhone() {
			return phone;
		}


		public void setPhone(int phone) {
			this.phone = phone;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}

	}
