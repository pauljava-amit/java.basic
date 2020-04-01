package com.opt.java.basics.day4;

class Samsung{
	
	void showFeatures(boolean hi) {
		System.out.println("boolean");
	}
	
	void showFeatures(int price) {
		System.out.println("int");
	}
	
	void showFeatures(String hello) {
		System.out.println("String");
	} 
	
	
} // end of Samsung

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Samsung refSamsung = null;
		//refSamsung = new Samsung();
		refSamsung.showFeatures(true);
		refSamsung.showFeatures(20);
		refSamsung.showFeatures("i");
	}

}
