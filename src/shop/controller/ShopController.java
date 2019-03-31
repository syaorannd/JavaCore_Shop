package shop.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import shop.dao.DatabaseAccess;
import shop.model.*;
import shop.view.*;
import shop.ulti.*;
enum StatusDisplay{
	HOMENORMAL,
	HOMELOGIN,
	VIEWPRODUCTNORMAL,
	VIEWPRODUCTLOGIN,
	INFORMATION,
	LOGIN,
}
class ShopController {
	// property
	private ArrayList<Product> listProduct;
	private Display diplay;
	private LoginAdminController loginAdmin;
	private DatabaseAccess dbAccess;
	private boolean isLogin;
	
	// Constructor
	ShopController() {
		listProduct = new ArrayList<Product>();
		diplay = new Display();
		loginAdmin = new LoginAdminController();
		dbAccess = new DatabaseAccess();
		isLogin = false;
	}
	
	// Method
	void Initialize() {
		// Read list product from data
	}
	void displayStatus(StatusDisplay homenormal) {
		switch(homenormal) {
		case HOMENORMAL : {
			int ret = diplay.displayHome();
			if(ret == 1)
				displayStatus(StatusDisplay.VIEWPRODUCTNORMAL);
			else if(ret == 2) 
				displayStatus(StatusDisplay.INFORMATION);
			else if(ret == 3)
				displayStatus(StatusDisplay.LOGIN);
			else
				displayStatus(StatusDisplay.HOMENORMAL);
			break;
		}
		case HOMELOGIN : {
			int ret = diplay.displayLogin();
			if(ret == 1)
				displayStatus(StatusDisplay.VIEWPRODUCTNORMAL);
			else if (ret == 2)
				displayStatus(StatusDisplay.INFORMATION);
			else if (ret == 3) {
				displayStatus(StatusDisplay.HOMENORMAL);
				this.isLogin = false;
			}
			else 
				displayStatus(StatusDisplay.HOMELOGIN);
			break;
		}
		case VIEWPRODUCTNORMAL : {
			break;
		}
		case VIEWPRODUCTLOGIN : {
			break;
		}
		case INFORMATION : {
			int ret = diplay.displayInfor();
			if(ret == 1)
				displayStatus(isLogin ? StatusDisplay.HOMELOGIN : StatusDisplay.HOMENORMAL);
			else 
				displayStatus(isLogin ? StatusDisplay.HOMELOGIN : StatusDisplay.HOMENORMAL);
			break;
		}
		case LOGIN : {
			UserLogin userLogin = diplay.displayLoginUser();
			if(this.loginAccess(userLogin.name, userLogin.pass)) {
				displayStatus(StatusDisplay.HOMELOGIN);
				this.isLogin = true;
			}
			else {
				displayStatus(StatusDisplay.HOMENORMAL);
			}
		}
		default:
			break;
		}
		
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
	
	private boolean loginAccess(String userName, String password) {
		boolean ret = false;
		try {
			if(dbAccess.DataLoginRW(true, userName, password))
				ret = true;
		} catch (SQLException e) {
			ret = false;
			System.out.println(e.getMessage());
		}
		return ret;
	}
	
	public static void main(String[] args) {
		ShopController shopController = new ShopController();
		shopController.displayStatus(StatusDisplay.HOMENORMAL);
	}
}