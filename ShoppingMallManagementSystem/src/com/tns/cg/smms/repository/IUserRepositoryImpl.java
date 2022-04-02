package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.entity.User;

public class IUserRepositoryImpl implements IUserRepository {
	private EntityManager entityManager;

	public IUserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
