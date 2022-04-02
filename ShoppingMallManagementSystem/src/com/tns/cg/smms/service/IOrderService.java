package com.tns.cg.smms.service;

import com.entity.Item;
import com.entity.OrderDetails;

public interface IOrderService {
	/*
	 * Given methods in IOrderService Interface
	 */

	// Method for addorder
	public OrderDetails addOrder(OrderDetails order);

	// Method for update Order
	public OrderDetails updateOrder(OrderDetails order);

	// Method for searchorder
	public OrderDetails searchOrder(int id);

	// method for cancle mall
	public boolean cancelMall(int id);

	// method for add item
	public Item addItem(Item item);

}
