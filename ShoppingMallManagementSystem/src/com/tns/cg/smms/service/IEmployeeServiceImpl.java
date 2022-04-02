package com.tns.cg.smms.service;

import com.entity.Employee;
import com.repository.IEmployeeRepository;
import com.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	private IEmployeeRepository dao;

	// creating constructor
	public IEmployeeServiceImpl() {
		dao = new IEmployeeRepositoryImpl();
	}

	// Implementation of addEmployee method
	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	// Implementtion of updateEmployee method
	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	// Implementation of searchEmployee Method
	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
	}

	// Implementatin of deleteEmployee method
	@Override
	public boolean deleteEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
	}

}