package shop.controller;

import java.util.ArrayList;
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
	
	// Constructor
	ShopController() {
		listProduct = new ArrayList<Product>();
		diplay = new Display();
		loginAdmin = new LoginAdminController();
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
	
	public static void main(String[] args) {
		ShopController shopController = new ShopController();
	}
}