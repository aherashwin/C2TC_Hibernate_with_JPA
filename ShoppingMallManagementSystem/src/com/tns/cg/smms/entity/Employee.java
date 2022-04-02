package com.tns.cg.smms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int id;

	private String name;

	private LocalDate dob;

	private float salary;

	private String address;

	private String designation;

	@ManyToOne
	private Shop shop;

	// Generating Getters and Setters

	// get id
	public long getId() {
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

	// get date of birth
	public LocalDate getDob() {
		return dob;
	}

	// set date of birth
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	// get salary
	public float getSalary() {
		return salary;
	}

	// set salary
	public void setSalary(float salary) {
		this.salary = salary;
	}

	// get address
	public String getAddress() {
		return address;
	}

	// set address
	public void setAddress(String address) {
		this.address = address;
	}

	// get destination
	public String getDesignation() {
		return designation;
	}

	// set destination
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// get shop
	public Shop getShop() {
		return shop;
	}

	// set shop
	public void setShop(Shop shop) {
		this.shop = shop;
	}

	// creating constructor using fields
	public Employee(int id, String name, LocalDate dob, float salary, String address, String designation, Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop = shop;
	}

	// creating constructor using super class
	public Employee() {

	}

}
