package com.tns.cg.smms.repository;

import com.entity.User;

public interface IUserRepository {
	public User addUser(User user);

	public User updateUser(User user);

	public User deleteUser(int id);

	public void beginTransaction();

	public void commitTransaction();

}
