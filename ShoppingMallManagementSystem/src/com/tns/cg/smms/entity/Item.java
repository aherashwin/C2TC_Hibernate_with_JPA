package com.tns.cg.smms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	private int id;

	private String itemName;

	private double price;

	private LocalDate manufacturingDate;

	private LocalDate expiry;

	@ManyToOne
	private Shop shop;

	private enum category {
		CLOTHING, MOBILES, ACCESSIORIES
	}

	// creating constructor usinf fields
	public Item() {

	}

	// creating constructor using fields
	public Item(int id, String itemName, double price, LocalDate manufacturingDate, LocalDate expiry, Shop shop) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expiry = expiry;
		this.shop = shop;
	}
	// Generating Getters and setters

	// get id
	public int getId() {
		return id;
	}

	// set id
	public void setId(int id) {
		this.id = id;
	}

	// get item name
	public String getItemName() {
		return itemName;
	}

	// set item name
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// get price
	public double getPrice() {
		return price;
	}

	// set price
	public void setPrice(double price) {
		this.price = price;
	}

	// get MFG
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	// set MFG
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	// get EXP
	public LocalDate getExpiry() {
		return expiry;
	}

	// set exp
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
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
