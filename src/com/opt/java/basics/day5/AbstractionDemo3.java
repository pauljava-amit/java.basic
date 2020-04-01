package com.opt.java.basics.day5;

abstract class Oracle{
	abstract void getDriderOracle();
} // end of Oracle

abstract class Microsoft{ // Microsoft and Oracle has no relationship
	abstract void getDriderMicrosoft();
} // end of Microsoft

class MyApp {
	// We need both methods to implement
	// getDriderOracle() and getDriderMicrosoft()
	// how can it be possible??
	
	Oracle refOracle = new Oracle() {
		@Override
		void getDriderOracle() {
			System.out.println("I am in Oracle..");
		} // end of getDriderOracle
	}; // end of Oracle
	
	Microsoft refMicrosoft = new Microsoft() {
		@Override
		void getDriderMicrosoft() {
			System.out.println("I am in Microsoft..");
		} // end of getDriderMicrosoft
	}; // end of Microsoft
} // end of MyApp

public class AbstractionDemo3 {

	public static void main(String[] args) {
		
		

	}

}
