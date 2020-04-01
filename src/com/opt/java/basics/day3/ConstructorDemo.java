package com.opt.java.basics.day3;

class User{
	// constructor name and class name must be same
	// 
	User(){ // 
		System.out.println("I am inside default constructor..");
	} // end of User
	
	User(int data){ // 
		
	} // end of User
	
	User(String name, int number){
		
	} // end of User
	
} // end of User

public class ConstructorDemo {

	public static void main(String[] args) {
	
		new User();
		// you can't create more than one object

	}

}
