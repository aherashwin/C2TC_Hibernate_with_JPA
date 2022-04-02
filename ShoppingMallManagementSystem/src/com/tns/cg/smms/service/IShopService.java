package com.tns.cg.smms.service;

import com.entity.Employee;
import com.entity.Item;
import com.entity.Shop;

public interface IShopService {
	/*
	 * Given methods in IShopService interface
	 */

	// Method to create Shop
	public Shop addShop(Shop shop);

	// Method to update shop
	public Shop updateShop(Shop shop);

	// Method to search Shop
	public Shop searchShopById(int id);

	// Method to deleteshop
	public boolean deleteShop(int id);

	// method to addemployee
	public boolean addEmployee(Employee employee);

	// Method to update employee
	public boolean updateEmployee(Employee employee);

	// method to add Item
	public Item addItem(Item item);
}
