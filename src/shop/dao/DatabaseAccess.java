// TNN-TODO: Need change to access to database (not file :D)
package shop.dao;
public class DatabaseAccess{
	String fileName;
	String filePath;
	String dbName;
	String dbValue;
	public DatabaseAccess() {
		fileName = "";
		filePath = "";
		dbName = "";
		dbValue = "";		
	}
	// Can change this function to Util ?
	public boolean DataLoginRW(boolean read, String name, String pass) {
		// TNN-TODO : Need to write access file or database
		boolean ret = false;
		if(name == "Thinh" && pass == "Deptrai") {
			ret = true;
		}
		return ret;
	}
	
	public boolean DataRW(boolean read, String session, String Key, String values) {
		// TNN-TODO : Need to read write
		boolean ret = false;
		return ret;
	}
	
}