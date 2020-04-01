package com.opt.java.basics.day6;

public class WhatsApp {
	
	ChatApplication refChatApplication;
	
	/*
	 * public void setRefChatApplication(ChatApplication refChatApplication) {
	 * this.refChatApplication = refChatApplication; }
	 */
	
	WhatsApp(ChatApplication refChatApplication) {
		 this.refChatApplication = refChatApplication; 
	}
	
	/*
	 * public ChatApplication getRefChatApplication() { return refChatApplication; }
	 */
	@Override
	public String toString() {
		return refChatApplication.toString();
	}

}
