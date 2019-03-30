package shop.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import shop.dao.DatabaseAccess;
import shop.model.*;
import shop.view.*;
enum StatusDisplay{
	HOMENORMAL,
	HOMELOGIN,
	VIEWPRODUCTNORMAL,
	VIEWPRODUCTLOGIN,
	INFORMATION,
}
class ShopController {
	// property
	ArrayList<Product> listProduct;
	Display diplay;
	LoginAdminController loginAdmin;
	DatabaseAccess dbAccess;
	
	// Constructor
	ShopController() {
		listProduct = new ArrayList<Product>();
		diplay = new Display();
		loginAdmin = new LoginAdminController();
		dbAccess = new DatabaseAccess();
	}
	
	// Method
	void Initialize() {
		// Read list product from data
	}
	void displayHome(int statusDisplay) {
		
	}
	void addProduct(Product newPro) {
		
	}
	
	void deleteProduct(int num) {
		
	}
	void editProduct(int num) {
		
	}
	
	void connectToDB() {
		try {
			dbAccess.connect();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void disconnectToDB() {
		dbAccess.disconnect();
	}
	
	void loginAccess(String userName, String password) {
		try {
			dbAccess.DataLoginRW(true, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		ShopController shopController = new ShopController();
		shopController.loginAccess("thinhnn", "Toshiba123@");
	}
}