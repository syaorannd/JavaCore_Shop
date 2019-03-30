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
	public boolean LoginAdmin(String name, String pass) throws SQLException {
		boolean ret = false;
		if(dbAccess.DataLoginRW(true, name, pass)) {
			this.loginAlready = true;	
			ret = true;
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
