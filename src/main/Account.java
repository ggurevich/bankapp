package main;

public abstract class Account {

	protected String  accountId;

	protected double balance =0;

	public Account() {
	}

	public Account(double bal, String id) {
		if(balance >= 0){
			balance = bal;
		}
		accountId = id;
	}

	

}
