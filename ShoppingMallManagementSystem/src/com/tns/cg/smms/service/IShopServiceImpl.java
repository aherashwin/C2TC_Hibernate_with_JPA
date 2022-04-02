package com.tns.cg.smms.service;

import com.entity.Employee;
import com.entity.Item;
import com.entity.Shop;
import com.repository.IShopRepository;
import com.repository.IShopRepositoryImpl;

public class IShopServiceImpl implements IShopService {
	// Creating object for IShopRepository
	private IShopRepository dao;

	// creating constructor
	public IShopServiceImpl() {
		dao = new IShopRepositoryImpl();
	}

	// Implementation of Create Shop method
	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	// Implementation of updateshop method
	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	// implementation of searchShop method
	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao.searchShopById(id);
		return shop;
	}

	// implementation of deleteshop method
	@Override
	public boolean deleteShop(int id) {
		dao.beginTransaction();
		dao.deleteShop(id);
		dao.commitTransaction();
		return false;
	}

	// Implementation of creating employee
	@Override
	public boolean addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.addEmployee(employee);
		return false;
	}

	// implementation of Update employee method
	@Override
	public boolean updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return false;
	}

	// implementation of add item method
	@Override
	public Item addItem(Item item) {
		dao.beginTransaction();
		dao.addItem(item);
		dao.commitTransaction();
		return item;
	}

}
