package com.opt.java.basics.day5;

abstract class MyClass1{
	abstract void myMethod();
} // end of MyClass1

interface OOP{			// fully abstract class [ abstract keyword is optional ]
	void features();	// abstract method [ abstract keyword is optional ]
	/*
	 * void showDetails() { // method with a body, we can't write, Java 1.8 version onwards we can}
	 */
} // end of OOP

class Java extends MyClass1 implements OOP{
	@Override
	public void features() {
		
	}

	@Override
	void myMethod() {
		
	}
} // end of Java

class Python{
	
} // end of Python

public class AbstractionDemo4 {

	public static void main(String[] args) {
		
		

	}

}
