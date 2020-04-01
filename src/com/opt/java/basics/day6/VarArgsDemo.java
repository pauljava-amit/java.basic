package com.opt.java.basics.day6;

class Example{
	// The varargs uses ellipsis i.e. three dots after the data type.
	// return_type method_name(data_type... variableName){} 
	// void method(String... a, int... b){}//Compile time error 
	// void method(int... a, String b){}//Compile time error  
	// void display(int num, String... values){  // no compilation error
	
	public void showData(Object... args) {
		
		for (Object temp : args) {
			System.out.println(temp);
		} // end of for each
		
	
	} // end of showData
} // end of Example

public class VarArgsDemo {
	public static void main(String... args) {
		String name[] = {"Java","Python","React"};
		int[] num = {1,2,3};
		Example ref = new Example();
		ref.showData(name);
		ref.showData(num);
		ref.showData(1,3,5,9,10,20,30);
		
	
	} // end of main
} // end of VarArgsDemo

