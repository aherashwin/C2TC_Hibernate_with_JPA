package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.entity.Item;
import com.entity.Mall;
import com.entity.OrderDetails;

public class IOrderrepositoryImpl implements IOrderRepository {
	private EntityManager entityManager;

	public IOrderrepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class, id);
		return order;
	}

	@Override
	public OrderDetails deleteOrder(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class, id);
		entityManager.remove(order);
		return order;
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
	public Mall cancelMall(int id) {
		Mall mall = entityManager.find(Mall.class, id);
		entityManager.remove(mall);
		return mall;
	}

	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

}
