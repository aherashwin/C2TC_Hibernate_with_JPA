package com.tns.cg.smms.repository;

import com.entity.Item;

public interface IItemRepository {
	/*
	 * given methods
	 */

	// method for addItem
	public Item addItem(Item item);

	// method for updateItem
	public Item updateItem(Item item);

	// method for searchItem
	public Item searchItem(int id);

	// method for deleteItem
	public Item deleteItem(int id);

	// method for begin transaction with database
	public void beginTransaction();

	// method for commiting transaction with database
	public void commitTransaction();

}
