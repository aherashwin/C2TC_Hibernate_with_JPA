package com.tns.cg.smms.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	private int id;
	private LocalDateTime dateOfPurchase;
	private float total;
	@ManyToOne
	private List<Customer> customers;

	private enum paymentMode {
		CARD, CASH, UPI, ONLINEBANKING
	};

	@ManyToOne
	private Shop shop;

	// creating constructor using super class
	public OrderDetails() {

	}

	// creating constructor using fileds
	public OrderDetails(int id, LocalDateTime dateOfPurchase, float total, List<Customer> customers, Shop shop) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.customers = customers;
		this.shop = shop;
	}
// Generating Getters and Setters for fields

	// Get Id
	public int getId() {
		return id;
	}

	// set id
	public void setId(int id) {
		this.id = id;
	}

	// get date of Purchase
	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}

	// set date of purchase
	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	// get total
	public float getTotal() {
		return total;
	}

	// set total
	public void setTotal(float total) {
		this.total = total;
	}

	// get list of customers
	public List<Customer> getCustomers() {
		return customers;
	}

	// set customers
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	// get shop
	public Shop getShop() {
		return shop;
	}

	// set shop
	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
