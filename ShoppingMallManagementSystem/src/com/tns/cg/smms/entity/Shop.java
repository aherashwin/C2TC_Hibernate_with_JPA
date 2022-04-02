package com.tns.cg.smms.entity;

import java.rmi.dgc.Lease;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Shop {
	@Id
	private int shopId;

	private enum shopCategory {
		WHOLESALE, RETAIL
	};

	@OneToMany
	private List<Employee> shopEmployees;

	private String shopName;

	@OneToMany
	private List<Customer> customers;

	private enum shopStatus {
		OPEN, CLOSED
	};

	@OneToOne
	private ShopOwner shopOwner;

	private Lease leaseStatus;

	// creating constructor using super class
	public Shop() {

	}

	// creating constructor using fields
	public Shop(int shopId, List<Employee> shopEmployees, String shopName, List<Customer> customers,
			ShopOwner shopOwner, Lease leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopEmployees = shopEmployees;
		this.shopName = shopName;
		this.customers = customers;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}

	// generating Getters and Setters

	// get id
	public int getShopId() {
		return shopId;
	}

	// set id
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	// get list of employees
	public List<Employee> getShopEmployees() {
		return shopEmployees;
	}

	// set employees
	public void setShopEmployees(List<Employee> shopEmployees) {
		this.shopEmployees = shopEmployees;
	}

	// get shop name
	public String getShopName() {
		return shopName;
	}

	// set shop name
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	// get list of customers
	public List<Customer> getCustomers() {
		return customers;
	}

	// set customers
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	// get shop owner
	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	// set shop owner
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	// get lease status
	public Lease getLeaseStatus() {
		return leaseStatus;
	}

	// set lease status
	public void setLeaseStatus(Lease leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}