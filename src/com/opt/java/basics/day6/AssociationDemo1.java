package com.opt.java.basics.day6;



public class AssociationDemo1 {

	public static void main(String[] args) {
		
		/*
		 * ChatApplication refChatApplication = new ChatApplication(); WhatsApp
		 * refWhatsApp = new WhatsApp(); Mobile refMobile = new Mobile();
		 * refChatApplication.setName("Alex");
		 * refWhatsApp.setRefChatApplication(refChatApplication);
		 * refMobile.setRefWhatsApp(refWhatsApp);
		 */
		String name = "Alex";
		ChatApplication refChatApplication = new ChatApplication(name);
		WhatsApp refWhatsApp = new WhatsApp(refChatApplication);
		Mobile refMobile = new Mobile(refWhatsApp);

		//System.out.println(refMobile.getRefWhatsApp().getRefChatApplication().getName());
		
		System.out.println(refMobile.refWhatsApp.refChatApplication);
		
	}

}
