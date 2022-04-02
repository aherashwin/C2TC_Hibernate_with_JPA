package com.tns.cg.smms.service;

import com.entity.User;

public interface IUserService {
	/*
	 * Given Methods in UserService interface
	 */

	// Method to add/ Create user
	public User addUser(User user);

	// Method to Update user details
	public User updateUser(User user);

	// Method for Login operation
	public boolean login(User user);

	// Method for Logout operation
	public boolean logOut();
}
