package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		super.deposit();
	System.out.println(" axis bank deposied amount is 200");
	

	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
	
		a.indianBankSavings();
		a.fixed();
		a.deposit();
	}
}
