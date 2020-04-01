package factory;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		String choice = sc.next();
		
		Bank refBank = MyBusinessLogic.getBusinessLogic("dbs"); // new DBS();
		refBank.getBankDetails(); //new DBS().getBankDetails()

	} // end of main

} // end of BankApplication
