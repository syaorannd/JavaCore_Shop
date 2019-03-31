// TNN-TODO: Need change to access to database (not file :D)
package shop.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import shop.model.Product;
import shop.ulti.UserLogin;


public class DatabaseAccess{
	String fileName;
	String dbName;
	String dbValue;
	Connection conn;
	UserLogin user;
	public DatabaseAccess() {
		fileName = "";
		dbValue = "";	
		conn = null;
		user = new UserLogin();
	}
	// Connect to database
	public void connect() throws SQLException {
		try {
			fileName = "jdbc:sqlite:/home/thinhnn/Documents/JavaProject/JavaCore_Shop/shop.db";
			conn = DriverManager.getConnection(fileName);
			System.out.println("Connect to SQLite has been established.");
		
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Disconnect to database
	public void disconnect() {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
				System.out.println(ex.getMessage());
		}
	}
	
	
	// Can change this function to Util ?
	public boolean DataLoginRW(boolean read, String name, String pass) throws SQLException {
		boolean ret = false;
		this.connect();
		// Select name and pass from shop on Sqlite3
		String sql = "SELECT name, pass FROM shop";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		// TNN-TODO : Need to change rs.next function
		while (rs.next()) {
			user.name = rs.getString("name");
			user.pass = rs.getString("pass");
		}
		if(name.equals(user.name) && pass.equals(user.pass)){
			System.out.println("Login successfull!");
			ret = true;
		}
		else {
			System.out.println("Login Error!");
		}
		this.disconnect();
		return ret;
	}
	
	public boolean DataRW(boolean read, ArrayList<Product> listProduct) throws SQLException {
		boolean ret = false;
		this.connect();
		// Select name and pass from shop on Sqlite3
		String sql = "SELECT name, cost, numOfProduct FROM products";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Product temp = new Product();
			temp.setName(rs.getString("name"));
			temp.setCost(Integer.parseInt(rs.getString("cost")));
			temp.setNumOfProduct(Integer.parseInt(rs.getString("numOfProduct")));
			listProduct.add(temp);
		}
		this.disconnect();
		return ret;
	}
	
}
