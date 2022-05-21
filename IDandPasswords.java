package Proiect;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Admin","admin");
	}
	
	public HashMap<String, String> getLoginInfo(){
		return logininfo;
	}
}