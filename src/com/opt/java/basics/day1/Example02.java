package com.opt.java.basics.day1;

class Employee{
	
	int employeeID = 12099;					// non-static variable
	static String employeeName = "Alex";    // static variable
	
	void displayInformation1() {			// non-static method
		
		// call employeeID and employeeName
		System.out.println(employeeID + " "+employeeName ); // why we need to create object here??
		
	} // end of displayInformation1
	
	static void displayInformation2() {		// static method
		
		// call employeeID and employeeName
		System.out.println(new Employee().employeeID + " "+employeeName );
		
	} // end of displayInformation2
	
} // end of Person

public class Example02 {
	public static void main(String[] args) {

		// call displayInformation1() and displayInformation2() and print the output
		Employee ref = new Employee();
		ref.displayInformation1();
		Employee.displayInformation2(); // ClassName.methodName

	}

}
