package com.crimsonlogic.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.crimsonlogic.dao.EmployeeDAO;
import com.crimsonlogic.model.Employee;
import com.crimsonlogic.util.DBUtil;
// Dao layer Implementattion
public class EmployeeDAOImpl implements EmployeeDAO {
	// Method to insert data 
	@Override
	public void createEmployee(Employee employee) {
		
		String SQL = "INSERT INTO employees (id,name,department,project,domain,remarks)" + " VALUES (?, ?, ?, ?,?,?)";
		try(Connection connection = DBUtil.getConnection();PreparedStatement ps = connection.prepareStatement(SQL)) {
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getDepartment());
			ps.setString(4, employee.getProject());
			ps.setString(5, employee.getDomain());
			ps.setString(6, employee.getRemarks());
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate==1){
				System.out.println("Employee is created..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 // Method to retrieve employee by id
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		Employee employee = null;
		String SQL = "SELECT * FROM employees WHERE id =?";
		try(Connection connection = DBUtil.getConnection();PreparedStatement ps = connection.prepareStatement(SQL)) {
			
			ps.setInt(1, employeeId);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int empId = rs.getInt("id");
				String eName = rs.getString("Name");
				String dep = rs.getString("Department");
				String proj = rs.getString("Project");
				String dom = rs.getString("Domain");
				String rem = rs.getString("Remarks");
				
				
				
				employee = new Employee();
				employee.setId(empId);
				employee.setName(eName);
				employee.setDepartment(dep);
				employee.setProject(proj);
				employee.setDomain(dom);
				employee.setRemarks(rem);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return employee;
	}
 // Method to update employee by id
	@Override
	public void updateEmployeeById(String uname, Integer uid) {
 
		String SQL = "UPDATE employees set name=? WHERE id=?";
		try(Connection connection = DBUtil.getConnection();PreparedStatement ps = connection.prepareStatement(SQL)) {
			
			ps.setString(1, uname);
			ps.setInt(2,uid);
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate >0){
				System.out.println("Employee name is updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	// method to get all the employees
 
	@Override
	public List<Employee> getAllEmployeesInfo() {
 
		List<Employee> empList = new ArrayList<>();
		String SQL = "SELECT *FROM employees";
		try(Connection connection = DBUtil.getConnection();PreparedStatement ps = connection.prepareStatement(SQL)) {
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int empId = rs.getInt("id");
				String eName = rs.getString("Name");
				String dep = rs.getString("Department");
				String proj = rs.getString("Project");
				String dom = rs.getString("Domain");
				String rem = rs.getString("Remarks");
				
				Employee employee = new Employee();
				employee.setName(eName);
				employee.setDepartment(dep);
				employee.setProject(proj);
				employee.setDomain(dom);
				employee.setRemarks(rem);
				
				empList.add(employee);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	
	 
	
	
}