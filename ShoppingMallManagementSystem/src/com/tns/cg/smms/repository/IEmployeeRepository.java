package com.tns.cg.smms.repository;

import com.entity.Employee;

public interface IEmployeeRepository {
	/*
	 * Given methods
	 */
	// method to add employee
	public Employee addEmployee(Employee employee);

	// method to update employee
	public Employee updateEmployee(Employee employee);

	// method to search employee
	public Employee searchEmployee(int id);

	// method to delete employee
	public boolean deleteEmployee(int id);

	// beginTrasaction method to start connection with database
	public abstract void beginTransaction();

	// commitTransaction method for persisting entries
	public abstract void commitTransaction();
}
