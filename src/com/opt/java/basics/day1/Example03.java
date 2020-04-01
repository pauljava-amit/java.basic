package com.opt.java.basics.day1;

class Customer{
	
	int customerID = 20;						// global variable
	String customerName = "David";				// global variable
	int number = 150;	
	void getData(int customerID,String customerName2, int number) {		// local  variables holds the data 
		
			this.customerID = customerID;
			customerName = customerName2;
			number = number;
		
		
	} // end of getData
	
	void displayData() {
		 
		System.out.println(customerID + " "+customerName+" "+number); // global or local
	} // end of displayData
	
	
} // end of Customer

public class Example03 {

	public static void main(String[] args) {
	
		Customer refCustomer = new Customer();
		refCustomer.getData(100, "Alex",50);				// data or argument
		refCustomer.displayData(); // print 100 Alex
	
	}

}
