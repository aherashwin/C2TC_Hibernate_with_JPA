package com.tns.cg.smms.service;

import com.entity.Item;
import com.entity.OrderDetails;
import com.repository.IOrderRepository;
import com.repository.IOrderrepositoryImpl;

public class IOrderServiceImpl implements IOrderService {
	// Creating object for IOrderRepository
	private IOrderRepository dao;

	// Constructor
	public IOrderServiceImpl() {
		dao = new IOrderrepositoryImpl();
	}

	// Implementation of add order method
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	// Implementation of update Order method
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}

	// Implementation of searchOrder method
	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails orderDetails = dao.searchOrder(id);
		return orderDetails;
	}

	// Implementation of cancle mall method
	@Override
	public boolean cancelMall(int id) {
		dao.beginTransaction();
		dao.cancelMall(id);
		dao.commitTransaction();
		return false;
	}

	// Implementation of add item method
	@Override
	public Item addItem(Item item) {
		dao.beginTransaction();
		dao.addItem(item);
		dao.commitTransaction();
		return item;
	}

}
