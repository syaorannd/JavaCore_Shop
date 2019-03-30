package shop.controller;
import java.sql.SQLException;

import shop.dao.*;
public class LoginAdminController {
	private boolean loginAlready;
	public DatabaseAccess dbAccess;
	// Constructor
	public LoginAdminController() {
		this.loginAlready = false;
		dbAccess = new DatabaseAccess();
	}
	// Login
	public boolean LoginAdmin(String name, String pass){
		boolean ret = false;
		try {
			if(dbAccess.DataLoginRW(true, name, pass)) {
				this.loginAlready = true;	
				ret = true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ret;
	}
	//Logout
	public boolean LogoutAdmin() {
		if(!loginAlready) {
			// Must Login before logout :D
			return false;
		}
		loginAlready = false;
		return true;
	}
	public boolean IsLogin() {
		return this.loginAlready;
	}
	
}
