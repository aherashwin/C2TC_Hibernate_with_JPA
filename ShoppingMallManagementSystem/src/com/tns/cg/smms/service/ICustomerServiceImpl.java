package com.tns.cg.smms.service;

import java.util.List;

import com.entity.Item;
import com.entity.Mall;
import com.entity.User;
import com.repository.ICustomerRepository;
import com.repository.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService {
	private ICustomerRepository dao;

	public ICustomerServiceImpl() {
		dao = new ICustomerRepositoryImpl();
	}

	// implementation of order item method
	@Override
	public Item orderItem(Item item) {
		dao.beginTransaction();
		dao.orderItem(item);
		dao.commitTransaction();
		return item;
	}

	// implementation of search item method
	@Override
	public List<Item> searchItem(String itemName) {

		return null;
	}

	// implementation of search Mall method
	@Override
	public Mall searchMall(int id) {
		Mall mall = dao.searchMall(id);
		return mall;
	}

	// Implementation of cancle Oder method
	@Override
	public boolean cancelOrder(int orderId) {
		dao.beginTransaction();
		dao.cancleOrder(orderId);
		dao.commitTransaction();
		return false;
	}

	// implementation of Login method
	@Override
	public User login(User user) {
		return null;
	}

	// Implementation of Logout method
	@Override
	public boolean logout() {
		return false;
	}

}
