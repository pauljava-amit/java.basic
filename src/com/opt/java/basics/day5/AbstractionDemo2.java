package com.opt.java.basics.day5;

abstract class Product{
	abstract void productDetails();
} // end of Product

abstract class Laptop extends Product{
	abstract void laptopDetails();
} // end of Laptop

class MyClass extends Laptop{

	@Override
	void laptopDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void productDetails() {
		// TODO Auto-generated method stub
		
	}
	
} // end of MyClass

public class AbstractionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
