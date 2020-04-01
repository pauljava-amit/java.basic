package com.opt.java.basics.day5;

class Driver{
	
	private static Driver refDriver = null;	// 
	
	private Driver() {	// private constructor		// 
		System.out.println("calling Driver..");		// prints the statement
	} // end of Driver
	
	public static Driver getDriver() {		// Driver is class
		if(refDriver==null) {				// true
			refDriver = new Driver();		// we create an object of Driver class, calls line 7
		}
		return refDriver;
	} // end of getDriver
} // end of Driver


public class SingletonDesignPattern {
	public static void main(String[] args) {
		Driver.getDriver();		// line 11	
		Driver.getDriver();		// line 11
		Driver.getDriver();
	}
}
