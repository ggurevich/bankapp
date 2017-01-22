package main;

import main.Bank;


public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Customer[] client = new Customer[100];
		
		System.out.println(bank.bankName);
		
	client[1] = new Customer("bob",1, null);
	
	System.out.println(client[1]);

	}

}
