package com.opt.java.basics.day6;

public class ChatApplication {
	
	private String name;
	
	/*
	 * public void setName(String name) { this.name = name; }
	 */
	
	ChatApplication(String name){
		{ this.name = name; }
	}
	
	/*
	 * public String getName() { return name; }
	 */
	
	@Override
	public String toString() {
		return name;
	}

}
