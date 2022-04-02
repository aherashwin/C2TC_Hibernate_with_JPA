package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.entity.Employee;
import com.entity.Item;
import com.entity.Shop;

public class IShopRepositoryImpl implements IShopRepository {
	private EntityManager entityManager;

	public IShopRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		entityManager.remove(shop);
		return false;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return null;
	}

}
