package com.tns.cg.smms.service;

import com.entity.User;
import com.repository.IUserRepository;
import com.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {
	// creating object for data Access Objects
	private IUserRepository dao;

// creating connection with repository
	public IUserServiceImpl() {
		dao = new IUserRepositoryImpl();
	}

	// Implementation of AddUser method
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	// Implentation of userUpdate method
	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	// Implementing Login method
	@Override
	public boolean login(User user) {
		return false;
	}

	// Implementing LogOut method
	@Override
	public boolean logOut() {
		return false;
	}

}
