package com.crimsonlogic.model;
// PoJO class
public class Employee
{
int id;
String name;
String department;
String project ;
String domain;
String remarks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", project=" + project + ", domain="
			+ domain + ", remarks=" + remarks + "]";
}


}
