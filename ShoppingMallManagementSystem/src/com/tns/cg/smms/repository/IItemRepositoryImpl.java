package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.entity.Item;

public class IItemRepositoryImpl implements IItemRepository {
	private EntityManager entityManager;

	public IItemRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item searchItem(int id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}

	@Override
	public Item deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		entityManager.remove(item);
		return item;
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
