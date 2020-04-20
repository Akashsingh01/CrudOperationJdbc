package com.crimsonlogic;
///*
// * package com.crimsonlogic;
// * 
// * import java.sql.Connection; import java.sql.DriverManager; import
// * java.sql.PreparedStatement; import java.sql.ResultSet; import
// * java.sql.SQLException; import java.sql.Statement;
// * 
// * 
// * public class UsersManager {
// * 
// * 
// * static void insert() { String jdbcURL =
// * "jdbc:mysql://localhost:3306/CrimsonLogic"; String dbUsername = "root";
// * String dbPassword  root"; int id=1; String name = "Akash Singh"; String
// * department= "IT"; String project= "Emp Management"; String domain  Java";
// * String remarks= "good";
// * 
// * 
// * try { Connection connection =
// * DriverManager.getConnection(jdbcURL,dbUsername,dbPassword); String sql =
// * "INSERT INTO employees (id,name,department,project,domain,remarks)" +
// * " VALUES (?, ?, ?, ?,?,?)"; PreparedStatement statement =
// * connection.prepareStatement(sql); statement.setInt(1, id);
// * statement.setString(2, name); statement.setString(3, department);
// * statement.setString(4, project); statement.setString(5, domain);
// * statement.setString(6, remarks); int rows = statement.executeUpdate(); if
// * (rows>0) { System.out.println("A new useer has been insert successfully "); }
// * else System.out.println("Insert failed");
// * 
// * // if(connection!=null) // System.out.println("Connected to the Database");
// * connection.close();
// * 
// * } catch (SQLException e) {
// * 
// * e.printStackTrace(); }
// * 
// * } static void select() { String jdbcURL =
// * "jdbc:mysql://localhost:3306/CrimsonLogic"; String dbUsername = "root";
// * String dbPassword  root"; String sql = "select * from employees where id=?";
// * try (Connection conn =
// * DriverManager.getConnection(jdbcURL,dbUsername,dbPassword); PreparedStatement
// * stmt = conn.prepareStatement(sql);) {
// * 
// * stmt.setInt(1, 1); try (ResultSet rs = stmt.executeQuery();) { while
// * (rs.next()) { System.out.println("EMP_ID  + rs.getString(1));
// * System.out.println("NAME  + rs.getString(2)); System.out.println("DOB  +
// * rs.getString(3)); System.out.println("EMAIL  + rs.getString(4));
// * System.out.println("DEPT  + rs.getString(5)); } } } catch (SQLException e) {
// * e.printStackTrace(); } } static void update() { String jdbcURL =
// * "jdbc:mysql://localhost:3306/CrimsonLogic"; String dbUsername = "root";
// * String dbPassword  root"; String sql =
// * "update employees set name='Akash Singh' where id=1"; try (Connection conn =
// * DriverManager.getConnection(jdbcURL,dbUsername,dbPassword); Statement stmt =
// * conn.createStatement();) {
// * 
// * stmt.executeUpdate(sql);
// * System.out.println("Database updated successfully "); } catch (SQLException
// * e) { e.printStackTrace(); } }
// * 
// * public static void main(String[] args) {
// * 
// * 
// * //insert();
// * 
// * update(); select();
// * 
// * } }
// */
