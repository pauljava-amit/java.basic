package com.opt.java.basics.day4;

class Bank{
	void showBankData() {
		System.out.println("I am in show bank data");
	}
} // end of Bank

class DigitalBank extends Bank{
	void showDigitalBankData() {
		System.out.println("I am in show digital bank data");
	}
} // end of DigitalBank

class DBS extends DigitalBank{
	void showDBSData() {
		System.out.println("I am in show DBS data");
	}
} // end of DBS

class PayLa extends DBS{
	void showPayLaData() {
		System.out.println("I am in show PayLa data");
	}
} // end of PayLa

class MyClass extends PayLa{
	
	void myData() {
		showPayLaData();
		showDBSData();
		showDigitalBankData();
		showBankData();
	}
	
} // end of Myclass

public class InheritanceDemo01 {

	public static void main(String[] args) {
		
		MyClass refMyClass = new MyClass();
		refMyClass.myData();

	}

}
