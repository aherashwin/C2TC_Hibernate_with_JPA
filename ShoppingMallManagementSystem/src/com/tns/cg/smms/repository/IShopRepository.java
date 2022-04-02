package com.tns.cg.smms.repository;

import com.entity.Employee;
import com.entity.Item;
import com.entity.Shop;

public interface IShopRepository {
	public Shop addShop(Shop shop);

	public Shop updateShop(Shop shop);

	public Shop searchShopById(int id);

	public boolean deleteShop(int id);

	public void beginTransaction();

	public void commitTransaction();

	public Item addItem(Item item);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
}
