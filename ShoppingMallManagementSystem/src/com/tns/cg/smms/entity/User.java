package com.tns.cg.smms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String type;
	private String password;

	// creating constructor using super class
	public User() {

	}

	// creating constructor using fields
	public User(int id, String name, String type, String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}

	// Generated getters and setters for fields

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

	// get type
	public String getType() {
		return type;
	}

	// set type
	public void setType(String type) {
		this.type = type;
	}

	// get password
	public String getPassword() {
		return password;
	}

	// set password
	public void setPassword(String password) {
		this.password = password;
	}

}
