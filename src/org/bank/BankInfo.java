package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Saving Info");

	}
	private void fixed() {
		System.out.println("Fixed");

	}
	public static void main(String[] args) {
		BankInfo i = new BankInfo();
		i.saving();i.fixed();i.deposit();

	}

}
