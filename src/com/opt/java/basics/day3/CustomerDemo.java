package com.opt.java.basics.day3;

class Customer{
	
	String customerName="David";
	int customerID = 1020;
	@Override
	public String toString() {
		return  customerName + " " + customerID ;
	}
	
	
	
} // end of Customer


public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer refCustomer = new Customer();
		System.out.println(refCustomer);			// David  1020

	} // end of main()

} // 
