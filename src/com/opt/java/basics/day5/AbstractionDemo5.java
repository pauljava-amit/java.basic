package com.opt.java.basics.day5;

interface Company{
	
	int companyID = 111222333;	// final and static variable
	
} // end of Company

class Optimum implements Company{
	
	void details() {
		System.out.println(companyID);
	}
}

public class AbstractionDemo5 {

	public static void main(String[] args) {
		
		Optimum refOptimum = new Optimum();
		refOptimum.details();

	}

}
