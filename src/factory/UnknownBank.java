package factory;

public class UnknownBank implements Bank {

	@Override
	public void getBankDetails() {
		System.out.println("No data");
	}

}
