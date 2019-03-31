// TNN-TODO : Need to study later :v
package shop.view;

import java.util.Scanner;
import shop.ulti.*;
public class Display {
	public Display() {
//		System.out.println("===========================================================");
//		System.out.println("========================Shop Thinh NN======================");
//		System.out.println("1. View Products");
//		System.out.println("2. Information");
//		System.out.println("3. Login");
//		System.out.println("===========================================================");
	}
	public int displayProductNormal() {
		System.out.println("===========================================================");
		System.out.println("1. Back");
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
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	
	public int displayInfor() {
		System.out.println("* This project is created by ThinhNN, for test Java core **");
		System.out.println("1. Back");
		System.out.println("\r\n");
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
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter your choise: ");

	    String num = myObj.nextLine();  // Read user input
		
		return (Integer.parseInt(num));
	}
	public UserLogin displayLoginUser() {
		System.out.println("===========================================================");
		UserLogin user = new UserLogin();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("User: ");
		user.name = myObj.nextLine();  // Read user input
		System.out.print("Password: ");
		user.pass = myObj.nextLine();  // Read user input
		return user;
	}
	
}