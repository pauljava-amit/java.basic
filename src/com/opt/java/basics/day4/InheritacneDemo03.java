package com.opt.java.basics.day4;

class Parent{	// Super class or Base class
	static void showParentA() {
		System.out.println("Parent : showParentA");
	} // end of showParentA
	
	void showParentB() {
		System.out.println("Parent : showParentB");
	} // end of showParentB
} // end of Parent

class Child extends Parent{	// Sub class or Derived class
	
	static void showChildA() {
		System.out.println("Child : showParentA");
	} // end of showChildA
	
	void showChildB() {
		System.out.println("Child : showParentB");
	} // end of showChildB
	
	
} // end of Child

public class InheritacneDemo03 {

	public static void main(String[] args) {
		
		 Child refParent = (Child) new Parent();
		refParent.showParentA();
		refParent.showParentB();
	}

}
