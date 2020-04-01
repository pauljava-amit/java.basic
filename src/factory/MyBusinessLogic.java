package factory;

public class MyBusinessLogic {
	
	public static Bank getBusinessLogic(String choice) {
		
		if(choice.equals("dbs")) {
			return new DBSBank();
		} // end of if
		
		else if(choice.equals("hsbc")) {
			return new HSBCBank();
		} // end of if
		
		else {
			return new UnknownBank();
		} // end of else
	
	} // end of getBusinessLogic

} // end of MyBusinessLogic class
