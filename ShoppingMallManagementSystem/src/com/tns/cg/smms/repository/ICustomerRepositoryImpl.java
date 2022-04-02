package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.entity.Customer;
import com.entity.Item;
import com.entity.Mall;

public class ICustomerRepositoryImpl implements ICustomerRepository {
	private EntityManager entitymanager;

	// starting JPA life cycle
	public ICustomerRepositoryImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}

	// implementation of addCustomer method
	@Override
	public Customer addCustomer(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	// Implementation of updateCustomer method
	@Override
	public Customer updateCustomer(Customer customer) {
		entitymanager.merge(customer);
		return customer;
	}

	// Implementation of searchCustomer Method
	@Override
	public Customer searchCustomer(int id) {
		Customer customer = entitymanager.find(Customer.class, id);
		return customer;
	}

	// implementation of deleteCustomer method
	@Override
	public Customer deleteCustomer(int id) {
		Customer customer = entitymanager.find(Customer.class, id);
		entitymanager.remove(customer);
		return customer;
	}

	// Implementation of searchMall method
	@Override
	public Mall searchMall(int id) {
		Mall mall = entitymanager.find(Mall.class, id);
		return mall;
	}

	// Implementtion of beginTransaction method
	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
	}

	// Implementation of commit Transaction method
	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}

	// implementation of cancle order method
	@Override
	public boolean cancleOrder(int orderId) {
		Item item = entitymanager.find(Item.class, orderId);
		entitymanager.remove(item);
		return false;
	}

	// Implementation of order Item method
	@Override
	public Item orderItem(Item item) {
		entitymanager.persist(item);
		return item;

	}

}
