package com.opt.logindemo;

public class UserService {
	
	private UserDAO refUserDAO; // refUserDAO is reference of UserDAO class
	private boolean checkStatus;
	
	boolean getLoginValidate(User refUser) {
		refUserDAO = new UserDAO();
		checkStatus = refUserDAO.loginValidate(refUser);
		return checkStatus;
	} // end of getLoginValidate
	
} // end of UserService
