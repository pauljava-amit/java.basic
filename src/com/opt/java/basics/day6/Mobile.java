package com.opt.java.basics.day6;

public class Mobile {
	
	WhatsApp refWhatsApp;
	
	 /*
	 * public void setRefWhatsApp(WhatsApp refWhatsApp) { this.refWhatsApp =
	 * refWhatsApp; }
	 */
	
	Mobile(WhatsApp refWhatsApp) { 
		this.refWhatsApp = refWhatsApp; 
	}
	
	 /*
	 * public WhatsApp getRefWhatsApp() { return refWhatsApp; }
	 */
	
	@Override
	public String toString() {
		return refWhatsApp.toString();
	}

}
