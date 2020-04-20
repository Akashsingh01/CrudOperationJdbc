package com.crimsonlogic.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import com.crimsonlogic.dao.EmployeeDAO;
import com.crimsonlogic.dao.impl.EmployeeDAOImpl;
import com.crimsonlogic.model.Employee;

public class Test {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	Employee employee = getEmployee();
		employeeDAO.createEmployee(employee);
		//getEmployeeById(employeeDAO);
		//employeeDAO.updateEmployeeById("Himanshu", 1);
		
		//getAllEmployeesInfo(employeeDAO);
		
		
		
		
		
	}
 
	private static void getAllEmployeesInfo(EmployeeDAO employeeDAO) {
		List<Employee> empList = employeeDAO.getAllEmployeesInfo();
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}
 
	private static void getEmployeeById(EmployeeDAO employeeDAO) {
		Employee employee2 = employeeDAO.getEmployeeById(4);
		if(employee2 != null){
			System.out.println(employee2);
		}else{
			System.out.println("Employee does not exist..");
		}
	}
 
	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Ravi");
		employee.setDepartment("Machine Learning");
		employee.setProject("Vedio Survuilence");
		employee.setDomain("python");
		employee.setRemarks("Excellent");
		
		return employee;
	}
	 

}
