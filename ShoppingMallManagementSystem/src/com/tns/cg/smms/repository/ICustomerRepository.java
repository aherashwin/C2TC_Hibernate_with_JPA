package com.tns.cg.smms.repository;

import com.entity.Customer;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Mall;

public interface ICustomerRepository {
	/*
	 * Given methods
	 */

	// method to create customer
	public Customer addCustomer(Customer customer);

	// method to update customer
	public Customer updateCustomer(Customer customer);

	// method to search customer
	public Customer searchCustomer(int id);

	// method to delete customer
	public Customer deleteCustomer(int id);

	// method to search mall
	public Mall searchMall(int id);

	// method to begin transaction with database
	public void beginTransaction();

	// method to commit transaction in database
	public void commitTransaction();

	// method to cancle order
	public boolean cancleOrder(int orderId);

	// method to create order
	public Item orderItem(Item item);

}
