package com.opt.java.basics.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 	Type Casting ==> Conversion of one data type of another

// 	In Java, we have 8 primitive data types
//	byte, short, char, int, float, long, double and boolean
//  String is consider as class in Java
//  Object is a super class of all the classes in Java

//  3 different types of casting
//  a) implicit and explicit casting
//  b) up casting and down casting
//  c) Auto boxing and Unboxing

//  implicit casting and explicit casting example

class Example1{
	
	void showExample() {
		int number1 = 20;
		long number2 = number1;		// implicit casting (less memory o higher memory), done by JVM
		
		System.out.println(number2);
		
		double number3 = 20.69;
		float number4 = (float) number3; // explicit casting(higher memory to less memory), done by Developer
		
		System.out.println(number4);
		
	} // end of showExample1
	
} //  end of Example1


// up casting and down casting example

class Example2{
	void showExample() {
		String name1 = "John";
		Object name2 = name1;		// up casting(child to parent conversion), done by JVM
		
		System.out.println(name2);
		
		Object name3 = "Shakti";	
		String name4 = (String) name3;		// down casting(parent to child conversion), down by Developer
		
		System.out.println(name4);
	} // end of showExample
} // end of Example2


// Primitive Data Types in Java ==> byte, short, char, int, float, long, double and boolean

// Wrapper class in Java 		==> Byte, Short, Character, Integer, Float, Long, Double and Boolean

class Example3{
	
	void showExample() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your age : ");
		/*
		 * char name = (char) br.read(); System.out.println(name);
		 */
		int age = br.read();
		System.out.println(age);
	}
	
} // end of Example3

public class TypeCastingDemo {

	public static void main(String[] args) throws IOException {
	
		Example3 ref = new Example3();
		ref.showExample();

	}

}
