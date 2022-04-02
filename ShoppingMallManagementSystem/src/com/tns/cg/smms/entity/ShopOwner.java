package com.tns.cg.smms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShopOwner {
	@Id
	private int id;
	private String name;
	private String address;
	private LocalDate dob;
	@OneToOne
	private Shop shop;

	// creating constructor using super class
	public ShopOwner() {

	}

	// creating constructor using fields
	public ShopOwner(int id, String name, String address, LocalDate dob, Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.shop = shop;
	}

	// generating Getters and Setters for fields

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

	// get address
	public String getAddress() {
		return address;
	}

	// set address
	public void setAddress(String address) {
		this.address = address;
	}

	// get local date
	public LocalDate getDob() {
		return dob;
	}

	// set local date
	public void setDob(LocalDate dob) {
		this.dob = dob;
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
