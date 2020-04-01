package com.opt.logindemo;

public class UserController {
	
	private UserService refuserService; 
	private User refUser;
	boolean check;
	
	void myLogic() {
		refUser = new User();		// create object of User class
		refUser.setUserID(111);		// set user ID
		refUser.setUserPassword("optimum");	// set user password
		
		refuserService = new UserService();		// create object of UserService
		if(refuserService.getLoginValidate(refUser)) { // call getLoginValidate and pass User reference as argument
			System.out.println("Welcome");
		}
		
		else {
			System.out.println("wrong!!");
		}
		
		
	} // end of myLogic
	
} // end of UseController

