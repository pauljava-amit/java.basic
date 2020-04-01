package com.opt.java.basics.day4;
class HP{
	
	int number;
	HP(){
		number = 30;
		System.out.println(number);
	}
	
	/*
	 * HP(int price){
	 * 
	 * }
	 * 
	 * HP(String model,int price){
	 * 
	 * }
	 */
	
} // end of HP

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		new HP();

	}
}
