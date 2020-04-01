package com.opt.java.basics.day4;

class Language{
	
	Language ref ;
	
	Language showData() {
			ref = new Language();
		return ref;
		
	} // end  of showData
	
} // end of Language



class Java extends Language{
	Java ref;
	@Override
	Java showData() {
		ref = new Java();
		return ref;
	} // end  of showData
} // end of Java

public class MethodOverridingDemo {
	public static void main(String[] args) {
			Java refJava = new Java();
			refJava.showData();
	}

}
