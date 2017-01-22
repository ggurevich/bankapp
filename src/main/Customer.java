package main;



public class Customer {
	
	private long id;
	
	private String name;
	
	private Account accounts;
	
	Customer() {}
	
	Customer(String name){}
	
	Customer(String name, long id, Account accounts){
		this.name=name;
		this.id=id;
		this.accounts=accounts;
	}

	

	public Account getAccounts() {
		return accounts;
	}

	

}
