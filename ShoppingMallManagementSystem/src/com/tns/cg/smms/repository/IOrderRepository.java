package com.tns.cg.smms.repository;

import com.entity.Item;
import com.entity.Mall;
import com.entity.OrderDetails;

public interface IOrderRepository {
	public OrderDetails addOrder(OrderDetails order);

	public OrderDetails updateOrder(OrderDetails order);

	public OrderDetails searchOrder(int id);

	public OrderDetails deleteOrder(int id);

	public void beginTransaction();

	public void commitTransaction();

	public Mall cancelMall(int id);

	public Item addItem(Item item);
}
