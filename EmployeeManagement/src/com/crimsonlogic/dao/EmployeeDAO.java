package com.crimsonlogic.dao;

import java.util.List;

import com.crimsonlogic.model.Employee;
// Dao layer 
public interface EmployeeDAO {
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(Integer employeeId);
	
	
	public abstract List<Employee> getAllEmployeesInfo();
	public abstract void updateEmployeeById(String uname, Integer uid);
}

