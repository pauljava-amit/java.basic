package com.opt.java.basics.day4;

interface FrontendDeveloper{
	void skillsFrontendDeveloper();
} // end of FrontendDeveloper

interface BackendDeveloper extends FrontendDeveloper{
	void shillsBackendDeveloper();
} // end of BackendDeveloper

class MySkills implements BackendDeveloper{

	@Override
	public void shillsBackendDeveloper() {
		System.out.println("Java, Spring Boot, Maven, Rest API...");
	}

	@Override
	public void skillsFrontendDeveloper() {
		System.out.println("HTML, CSS, JavaScript, React JS, Rest API...");	
	}
} //  end of MySkills


public class AbstractionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
