// TNN-TODO : Need to study later :v
package shop.view;

import java.util.ArrayList;
import java.util.Scanner;

import shop.model.Product;
import shop.ulti.*;
public class Display {
	ArrayList<Product> listProduct;
	public Display() {
		
	}
	public Display(ArrayList<Product> listProduct) {
		this.listProduct = listProduct;
	}
	public void setListProduct(ArrayList<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
	public void displayProductNormal(Product product) {
		System.out.println("===========================================================");
		System.out.println("**************");
		System.out.println("Name: " + product.getName());
		System.out.println("Cost: " + product.getCost());
		System.out.println("Number of product: " + product.getNumPro());
		System.out.println("**************");
	}
	public int retNum() {
		System.out.println("1. Back");
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	// When login , can display Add, Edit, Delete Item
	public int displayProductLogin() {
		System.out.println("===========================================================");
		System.out.println("1. Back");
		System.out.println("2. Choose your product");
		System.out.println("3. Edit product number ");
		System.out.println("\r\n");
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	
	public int displayInfor() {
		System.out.println("* This project is created by ThinhNN, for test Java core **");
		System.out.println("1. Back");
		System.out.println("\r\n");
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	
	public int displayLogin() {
		System.out.println("===========================================================");
		System.out.println("========================Shop Thinh NN======================");
		System.out.println("1. View Products");
		System.out.println("2. Information");
		System.out.println("3. Logout");
		System.out.println("\r\n");
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
		
	}
	public int displayHome() {
		System.out.println("===========================================================");
		System.out.println("========================Shop Thinh NN======================");
		System.out.println("1. View Products");
		System.out.println("2. Information");
		System.out.println("3. Login");
		System.out.println("\r\n");
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	public UserLogin displayLoginUser() {
		System.out.println("===========================================================");
		UserLogin user = new UserLogin();
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("User: ");
		user.name = myObj.nextLine();  // Read user input
		System.out.print("Password: ");
		user.pass = myObj.nextLine();  // Read user input
		return user;
	}
	
}