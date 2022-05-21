package Proiect;

import java.util.HashMap;

public class IDandPasswords2 {

	HashMap<String,String> logininfo2 = new HashMap<String,String>();
	
	IDandPasswords2(){
		
		logininfo2.put("Alex Ionescu","585927");
		logininfo2.put("Vasile Popescu","577440");
		logininfo2.put("Alexandra Enache","241038");
		logininfo2.put("Octavian Oprea","514621");
	}
	
	public HashMap<String, String> getLoginInfo2(){
		return logininfo2;
	}
}