package com.tns.cg.smms.service;

import java.util.List;

import com.entity.Item;
import com.entity.Mall;
import com.entity.User;

public interface ICustomerService {
	/*
	 * Given Methods
	 */

	// order Item method
	public Item orderItem(Item item);

	// search Item method
	public List<Item> searchItem(String itemName);

	// search mall method
	public Mall searchMall(int id);

	// cancle order method
	public boolean cancelOrder(int orderId);

	// user login method
	public User login(User user);

	// logout method
	public boolean logout();
}
