package com.tns.cg.smms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int id;

	private String name;

	@OneToMany
	private List<OrderDetails> orders;

	private int phone;

	private String email;

	// creating constructor using super class
	public Customer() {

	}

// creating constructor using fields

	public Customer(int id, String name, List<OrderDetails> orders, int phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
		this.phone = phone;
		this.email = email;
	}
	// Generating Getters and Setters

	// get id
	public int getId() {
		return id;
	}

	// set id
	public void setId(int id) {
		this.id = id;
	}

	// get name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	// get order details
	public List<OrderDetails> getOrders() {
		return orders;
	}

	// set order details
	public void setOrders(List<OrderDetails> orders) {
		this.orders = orders;
	}

	// get phone
	public int getPhone() {
		return phone;
	}

	// set phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// get email
	public String getEmail() {
		return email;
	}

	// set email
	public void setEmail(String email) {
		this.email = email;
	}

}
