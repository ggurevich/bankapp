package main;



public class Bank {

	public String bankName = "Union Bank";

	private Customer[] client = new Customer[100];

	Bank() {
	}

	Bank(String bankName) {
		System.out.println(bankName);
	}

	Bank(String bankName, Customer[] client) {
		System.out.println(bankName);
		this.client = client;

	}

	public Customer[] getCustomer() {
		return client;
	}

	public String getBankName() {
		return bankName;
	}

}
