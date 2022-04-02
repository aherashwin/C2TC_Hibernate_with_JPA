package com.tns.cg.smms.service;

import com.entity.Employee;

public interface IEmployeeService {
	/*
	 * Given methods in IEmployeeService Iterface
	 */

	// Method for add Employee
	public Employee addEmployee(Employee employee);

	// Method for update employee
	public Employee updateEmployee(Employee employee);

	// Method for searchEmployee
	public Employee searchEmployee(int id);

	// Method for deleteEmployee
	public boolean deleteEmployee(int id);

}
