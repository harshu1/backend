package com.backend.model;
import java.io.Serializable;



import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ForeignKey;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders") 
public class Order implements Serializable{
	
	@Id
	
	//@Column(name="billableId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int orderId;

	@Column(name="Status")
	private String Status;
	
	//------------------------------------------------Order mapped to Customer-------------------------------------------//
	
	
	
	
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name = "customerID",nullable=false,
	foreignKey = @ForeignKey (name="Order_customer_FK"))

	
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	//-------------------------------------------------------------------------------------------------------------------//
	
	
	
	//--------------------------Order mapped to Product---------------------------------------------//
	
	/*
	@OneToMany(mappedBy="billable",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Item> item;
	*/
    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="pid",nullable=false,foreignKey=@ForeignKey(name="Orderdetail_product_FK"))

    private	 Set<Product> product;
    
    public Set<Product> getProduct() {
		return product;
	}
    public void setProduct(Set<Product> product) {
		this.product = product;
	}
    
	//----------------------------------------------------------------------------------------------//


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


		public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}

	}
