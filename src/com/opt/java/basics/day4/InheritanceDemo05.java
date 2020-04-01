package com.opt.java.basics.day4;

class Super{
	void showData() {
		System.out.println("Super : showData");
	} // end of showData
} // end of Super

class Sub extends Super{
	void showData() {
		System.out.println("Sub : showData");
	} // end of showData
	
	void display() {
		super.showData();		// how to call Super : showData ??
		this.showData();
	}
} // end of Sub

public class InheritanceDemo05 {
	public static void main(String[] args) {
		Sub refSub = new Sub();
		refSub.display();
	}
}
