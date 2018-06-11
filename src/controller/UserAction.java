package controller;

public class UserAction {

	String flag;
	//String 
	
	public String skipMyDoc() {
		
		flag="skip-doc";
		
		return flag;
	}
	
	public String execute(){
		
		
		return "success";
	}
	public String skip() {
		
		
		
		return flag ;
	}

}
