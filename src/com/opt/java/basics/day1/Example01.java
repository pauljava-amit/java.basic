package com.opt.java.basics.day1;

public class Example01 {
	
	// global variables
	static int id1 = 10; // static variable
	int id2 = 20;  // non static variable
	
	public static void main(String[] args) {
		
		// step 1
		// call a static variable
		
		System.out.println("static variable : "+id1); 
		
		// step 2
		// call a non-static(instance) variable
		
		// we need to create object of this Example01 class, since main is static
		// static method can't call non-static method/variable directly
		
		// create an object of Example01
		Example01 ref = new Example01();
		System.out.println(ref.id2);
		
	} //  main () method

} // end of Example01
